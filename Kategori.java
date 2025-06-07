public class Kategori {
    private String idKategori;
    private String namaKategori;
    private String deskripsi;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    // Getter dan Setter untuk idKategori
    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    // Getter dan Setter untuk namaKategori
    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    // Getter dan Setter untuk deskripsi
    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
