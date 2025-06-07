import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Buat objek kategori
        Kategori kategori = new Kategori("Alat Tulis");
        kategori.setIdKategori("K001");
        kategori.setDeskripsi("Perlengkapan tulis-menulis kantor");

        // Buat objek gudang
        Gudang gudang = new Gudang("Gudang A");
        gudang.setIdGudang("G001");
        gudang.setAlamat("Jl. Industri No.10");

        // Buat objek pemasok
        Pemasok pemasok = new Pemasok("PT Sumber ATK");
        pemasok.setIdPemasok("P001");
        pemasok.setAlamat("Jl. Supplier No.7");
        pemasok.setKontak("08123456789");

        // Buat objek barang
        BarangATK barang = new BarangATK("ATK001", "Pulpen", kategori, 10, "pcs", gudang, 5);

        // Buat objek user
        User user = new User("U001", "Farel", "farel123", "password123");

        // Tampilkan semua informasi objek
        System.out.println("=== DATA MASTER ===");

        System.out.println("\n-- KATEGORI --");
        System.out.println("ID Kategori   : " + kategori.getIdKategori());
        System.out.println("Nama Kategori : " + kategori.getNamaKategori());
        System.out.println("Deskripsi     : " + kategori.getDeskripsi());

        System.out.println("\n-- GUDANG --");
        System.out.println("ID Gudang : " + gudang.getIdGudang());
        System.out.println("Nama      : " + gudang.getNamaGudang());
        System.out.println("Alamat    : " + gudang.getAlamat());

        System.out.println("\n-- PEMASOK --");
        System.out.println("ID Pemasok : " + pemasok.getIdPemasok());
        System.out.println("Nama       : " + pemasok.getNamaPemasok());
        System.out.println("Alamat     : " + pemasok.getAlamat());
        System.out.println("Kontak     : " + pemasok.getKontak());

        System.out.println("\n-- USER --");
        System.out.println("ID User   : " + user.getIdPengguna());
        System.out.println("Nama      : " + user.getNama());
        System.out.println("Username  : " + user.getUsername());


        System.out.println("\n-- BARANG ATK --");
        System.out.println("Kode Barang : " + barang.getKodeBarang());
        System.out.println("Nama Barang : " + barang.getNamaBarang());
        System.out.println("Kategori    : " + barang.getKategori().getNamaKategori());
        System.out.println("Stok        : " + barang.getStok());
        System.out.println("Satuan      : " + barang.getSatuan());
        System.out.println("Gudang      : " + barang.getLokasiGudang().getNamaGudang());
        System.out.println("Batas Min   : " + barang.getStokMinimum());
        // Buat transaksi masuk
        TransaksiMasuk transaksiMasuk = new TransaksiMasuk("T001", LocalDateTime.now(), barang, 20, pemasok);
        transaksiMasuk.setUser(user);
        barang.tambahStok(transaksiMasuk.getJumlah());

        System.out.println("\n=== TRANSAKSI MASUK ===");
        System.out.println("ID Transaksi : " + transaksiMasuk.getIdTransaksi());
        System.out.println("Tanggal      : " + transaksiMasuk.getWaktu());
        System.out.println("Barang       : " + transaksiMasuk.getBarang().getNamaBarang());
        System.out.println("Jumlah Masuk : " + transaksiMasuk.getJumlah());
        System.out.println("Pemasok      : " + transaksiMasuk.getPemasok().getNamaPemasok());
        System.out.println("Usernam      : " + transaksiMasuk.getUser().getUsername());
        System.out.println("Stok Sekarang: " + barang.getStok());

        // Buat transaksi keluar
        TransaksiKeluar transaksiKeluar = new TransaksiKeluar("T002", LocalDateTime.now(), barang, 25);
        transaksiKeluar.setUser(user);
        barang.kurangiStok(transaksiKeluar.getJumlah());

        System.out.println("\n=== TRANSAKSI KELUAR ===");
        System.out.println("ID Transaksi   : " + transaksiKeluar.getIdTransaksi());
        System.out.println("Tanggal        : " + transaksiKeluar.getWaktu());
        System.out.println("Barang         : " + transaksiKeluar.getBarang().getNamaBarang());
        System.out.println("Jumlah Keluar  : " + transaksiKeluar.getJumlah());
        System.out.println("Username       : " + transaksiKeluar.getUser().getUsername());
        System.out.println("Stok Sekarang  : " + barang.getStok());

        // Cek apakah stok menipis
        if (barang.isStokMenipis()) {
            System.out.println("\n⚠️  Stok barang '" + barang.getNamaBarang() + "' menipis!");
        } else {
            System.out.println("\n✅ Stok barang masih aman.");
        }
    }
}

