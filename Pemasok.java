public class Pemasok {
    private String idPemasok;
    private String namaPemasok;
    private String alamat;
    private String kontak;

    public Pemasok(String namaPemasok) {
        this.namaPemasok = namaPemasok;
    }

    // Getter dan Setter untuk idPemasok
    public String getIdPemasok() {
        return idPemasok;
    }

    public void setIdPemasok(String idPemasok) {
        this.idPemasok = idPemasok;
    }

    // Getter dan Setter untuk nama
    public String getNamaPemasok() {
        return namaPemasok;
    }

    public void setNamaPemasok(String nama) {
        this.namaPemasok = namaPemasok;
    }

    // Getter dan Setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter dan Setter untuk kontak
    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }
}
