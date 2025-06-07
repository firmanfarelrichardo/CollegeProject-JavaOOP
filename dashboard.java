import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.collections.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDateTime;

public class dashboard extends Application {

    private TableView<Transaksi> table;
    private ObservableList<Transaksi> data;

    /* private User currentUser = new User("admin"); */

    @Override
    public void start(Stage primaryStage) {
        TextField idField = new TextField();
        TextField kodebarangField = new TextField();
        TextField namabarangField = new TextField();
        TextField namapemasokField = new TextField();
        TextField jumlahField = new TextField();
        TextField kategoriField = new TextField();
        TextField satuanField = new TextField();
        TextField gudangField = new TextField();
        TextField stokField = new TextField();
        TextField stokMinimumField = new TextField();

        ComboBox<String> jenisBox = new ComboBox<>();
        jenisBox.getItems().addAll("Pemasukan", "Pengeluaran");
        jenisBox.setValue("Pemasukan");

        Button tambahBtn = new Button("Tambah Transaksi");

        table = new TableView<>();
        data = FXCollections.observableArrayList();

        TableColumn<Transaksi, String> idCol = new TableColumn<>("ID Transaksi");
        idCol.setCellValueFactory(new PropertyValueFactory<>("idTransaksi"));

        TableColumn<Transaksi, String> kodeCol = new TableColumn<>("Kode Barang");
        kodeCol.setCellValueFactory(cellData -> javafx.beans.binding.Bindings.createStringBinding(() ->
                cellData.getValue().getBarang().getKodeBarang()));

        TableColumn<Transaksi, String> namaBarangCol = new TableColumn<>("Nama Barang");
        namaBarangCol.setCellValueFactory(cellData -> javafx.beans.binding.Bindings.createStringBinding(() ->
                cellData.getValue().getBarang().getNamaBarang()));

        TableColumn<Transaksi, String> jenisCol = new TableColumn<>("Jenis");
        jenisCol.setCellValueFactory(cellData ->
                javafx.beans.binding.Bindings.createStringBinding(() -> cellData.getValue() instanceof TransaksiMasuk ? "Pemasukan" : "Pengeluaran"));

        TableColumn<Transaksi, Integer> jumlahCol = new TableColumn<>("Jumlah");
        jumlahCol.setCellValueFactory(new PropertyValueFactory<>("jumlah"));

        TableColumn<Transaksi, String> kategoriCol = new TableColumn<>("Kategori");
        kategoriCol.setCellValueFactory(cellData -> javafx.beans.binding.Bindings.createStringBinding(() ->
                cellData.getValue().getBarang().getKategori().getNamaKategori()));

        TableColumn<Transaksi, String> satuanCol = new TableColumn<>("Satuan");
        satuanCol.setCellValueFactory(cellData -> javafx.beans.binding.Bindings.createStringBinding(() ->
                cellData.getValue().getBarang().getSatuan()));

        TableColumn<Transaksi, String> gudangCol = new TableColumn<>("Gudang");
        gudangCol.setCellValueFactory(cellData -> javafx.beans.binding.Bindings.createStringBinding(() ->
                cellData.getValue().getBarang().getLokasiGudang().getNamaGudang()));

        TableColumn<Transaksi, Integer> stokCol = new TableColumn<>("Stok");
        stokCol.setCellValueFactory(cellData ->
                javafx.beans.binding.Bindings.createObjectBinding(() ->
                        cellData.getValue().getBarang().getStok()));

        TableColumn<Transaksi, Integer> stokMinCol = new TableColumn<>("Stok Minimum");
        stokMinCol.setCellValueFactory(cellData ->
                javafx.beans.binding.Bindings.createObjectBinding(() ->
                        cellData.getValue().getBarang().getStokMinimum()));

        TableColumn<Transaksi, String> pemasokCol = new TableColumn<>("Nama Pemasok");
        pemasokCol.setCellValueFactory(cellData ->
                javafx.beans.binding.Bindings.createStringBinding(() -> {
                    if (cellData.getValue() instanceof TransaksiMasuk masuk) {
                        return masuk.getPemasok().getNamaPemasok();
                    }
                    return "-";
                }));

        table.getColumns().addAll(idCol, kodeCol, namaBarangCol, jenisCol, jumlahCol,
                kategoriCol, satuanCol, gudangCol, stokCol, stokMinCol, pemasokCol);
        table.setItems(data);

        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);

        form.add(new Label("ID Transaksi:"), 0, 0);
        form.add(idField, 1, 0);
        form.add(new Label("Kode Barang:"), 0, 1);
        form.add(kodebarangField, 1, 1);
        form.add(new Label("Nama Barang:"), 0, 2);
        form.add(namabarangField, 1, 2);
        form.add(new Label("Nama Pemasok:"), 0, 3);
        form.add(namapemasokField, 1, 3);
        form.add(new Label("Jumlah:"), 0, 4);
        form.add(jumlahField, 1, 4);
        form.add(new Label("Kategori:"), 0, 5);
        form.add(kategoriField, 1, 5);
        form.add(new Label("Satuan:"), 0, 6);
        form.add(satuanField, 1, 6);
        form.add(new Label("Gudang:"), 0, 7);
        form.add(gudangField, 1, 7);
        form.add(new Label("Stok:"), 0, 8);
        form.add(stokField, 1, 8);
        form.add(new Label("Stok Minimum:"), 0, 9);
        form.add(stokMinimumField, 1, 9);
        form.add(new Label("Jenis Transaksi:"), 0, 10);
        form.add(jenisBox, 1, 10);
        form.add(tambahBtn, 1, 11);

        tambahBtn.setOnAction(e -> {
            try {
                String idTransaksi = idField.getText();
                String kodeBarang = kodebarangField.getText();
                String namaBarang = namabarangField.getText();
                String namaPemasok = namapemasokField.getText();
                int jumlah = Integer.parseInt(jumlahField.getText());
                String namaKategori = kategoriField.getText();
                String satuan = satuanField.getText();
                String namaGudang = gudangField.getText();
                int stok = Integer.parseInt(stokField.getText());
                int stokMinimum = Integer.parseInt(stokMinimumField.getText());
                String jenis = jenisBox.getValue();

                Kategori kategori = new Kategori(namaKategori);
                Gudang gudang = new Gudang(namaGudang);
                BarangATK barang = new BarangATK(kodeBarang, namaBarang, kategori, stok, satuan, gudang, stokMinimum);
                LocalDateTime waktu = LocalDateTime.now();

                if (jenis.equals("Pemasukan")) {
                    Pemasok pemasok = new Pemasok(namaPemasok);
                    barang.tambahStok(jumlah);
                    TransaksiMasuk transaksiMasuk = new TransaksiMasuk(idTransaksi, waktu, barang, jumlah, pemasok);
                    data.add(transaksiMasuk);
                } else {
                    barang.kurangiStok(jumlah);
                    TransaksiKeluar transaksiKeluar = new TransaksiKeluar(idTransaksi, waktu, barang, jumlah);
                    data.add(transaksiKeluar);
                }

                idField.clear();
                kodebarangField.clear();
                namabarangField.clear();
                namapemasokField.clear();
                jumlahField.clear();
                kategoriField.clear();
                satuanField.clear();
                gudangField.clear();
                stokField.clear();
                stokMinimumField.clear();

            } catch (NumberFormatException ex) {
                new Alert(Alert.AlertType.ERROR, "Pastikan jumlah, stok, dan stok minimum diisi dengan angka valid!").showAndWait();
            }
        });

        VBox root = new VBox(10, form, table);
        root.setStyle("-fx-padding: 20; -fx-font-family: 'Segoe UI';");

        Scene scene = new Scene(root, 1000, 600);
        primaryStage.setTitle("Dashboard Transaksi Barang ATK");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
