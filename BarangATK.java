public class BarangATK {
    private String kodeBarang;
    private String namaBarang;
    private Kategori kategori;
    private int stok;
    private String satuan;
    private Gudang lokasiGudang;
    private int stokMinimum;

    public BarangATK(String kodeBarang, String namaBarang, Kategori kategori, int stok, String satuan, Gudang lokasiGudang, int stokMinimum) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.stok = stok;
        this.satuan = satuan;
        this.lokasiGudang = lokasiGudang;
        this.stokMinimum = stokMinimum;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }

    public boolean isStokMenipis() {
        return stok <= stokMinimum;
    }

    @Override
    public String toString() {
        return "Barang: " + namaBarang + " (" + kodeBarang + ") - Stok: " + stok + " " + satuan;
    }

    // Getter dan Setter

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Gudang getLokasiGudang() {
        return lokasiGudang;
    }

    public void setLokasiGudang(Gudang lokasiGudang) {
        this.lokasiGudang = lokasiGudang;
    }

    public int getStokMinimum() {
        return stokMinimum;
    }

    public void setStokMinimum(int stokMinimum) {
        this.stokMinimum = stokMinimum;
    }
}
