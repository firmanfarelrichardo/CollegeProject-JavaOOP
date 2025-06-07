import java.time.LocalDateTime;

public class TransaksiKeluar extends Transaksi {

    public TransaksiKeluar(String idTransaksi, LocalDateTime waktu, BarangATK barang, int jumlah) {
        super(idTransaksi, waktu, barang, jumlah);
    }

    // Getter dan Setter untuk variabel dari superclass

    public String getIdTransaksi() {
        return super.getIdTransaksi();
    }

    public void setIdTransaksi(String idTransaksi) {
        super.setIdTransaksi(idTransaksi);
    }

    public LocalDateTime getWaktu() {
        return super.getWaktu();
    }

    public void setWaktu(LocalDateTime waktu) {
        super.setWaktu(waktu);
    }

    public BarangATK getBarang() {
        return super.getBarang();
    }

    public void setBarang(BarangATK barang) {
        super.setBarang(barang);
    }

    public int getJumlah() {
        return super.getJumlah();
    }

    public void setJumlah(int jumlah) {
        super.setJumlah(jumlah);
    }

    public User getUser() {
        return super.getUser();
    }

    public void setUser(User user) {
        super.setUser(user);
    }
}
