
public class User{
    protected String idPengguna;
    protected String nama;
    protected String username;
    protected String password;

    public User(String idPengguna, String nama, String username, String password ) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.username = username;
        this.password = password;
    }
    
    public String getIdPengguna() { return idPengguna; }
    public String getNama() { return nama; }
    public String getUsername() { return username; }

}