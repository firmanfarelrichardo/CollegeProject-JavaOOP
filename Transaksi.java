import java.time.LocalDateTime;

public class Transaksi {
    protected String idTransaksi;
    protected LocalDateTime waktu;
    protected BarangATK barang;
    protected int jumlah;
    protected User user;

    public Transaksi(String idTransaksi, LocalDateTime waktu, BarangATK barang, int jumlah) {
        this.idTransaksi = idTransaksi;
        this.waktu = waktu;
        this.barang = barang;
        this.jumlah = jumlah;
        this.user = user;
    }

    // Getter dan Setter

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public LocalDateTime getWaktu() {
        return waktu;
    }

    public void setWaktu(LocalDateTime waktu) {
        this.waktu = waktu;
    }

    public BarangATK getBarang() {
        return barang;
    }

    public void setBarang(BarangATK barang) {
        this.barang = barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
