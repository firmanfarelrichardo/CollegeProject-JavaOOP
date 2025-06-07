import java.time.LocalDateTime;

public class TransaksiMasuk extends Transaksi {
    private Pemasok pemasok;

    public TransaksiMasuk(String idTransaksi, LocalDateTime waktu, BarangATK barang, int jumlah, Pemasok pemasok) {
        super(idTransaksi, waktu, barang, jumlah);
        this.pemasok = pemasok;
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

    // Getter dan Setter untuk variabel lokal (pemasok)

    public Pemasok getPemasok() {
        return pemasok;
    }

    public void setPemasok(Pemasok pemasok) {
        this.pemasok = pemasok;
    }
}
