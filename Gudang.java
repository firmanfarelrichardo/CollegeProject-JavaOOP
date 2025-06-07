public class Gudang {
    private String idGudang;
    private String namaGudang;
    private String alamat;

    public Gudang(String namaGudang) {
        this.namaGudang = namaGudang;
    }

    // Getter dan Setter untuk idGudang
    public String getIdGudang() {
        return idGudang;
    }

    public void setIdGudang(String idGudang) {
        this.idGudang = idGudang;
    }

    // Getter dan Setter untuk namaGudang
    public String getNamaGudang() {
        return namaGudang;
    }

    public void setNamaGudang(String namaGudang) {
        this.namaGudang = namaGudang;
    }

    // Getter dan Setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
