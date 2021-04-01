import java.util.ArrayList;
import java.util.Collections;

public class Registrasi {

    private String NIK; // sudah
    private String nama;  // sudah
    private String username;
    private String email; //
    private String password;
    private char JenisKelamin; //sudah
    private int usia; // sudah

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setNIK(){
        ArrayList<String> a = new ArrayList<>();
        a.add("1");a.add("2");a.add("3");a.add("4");a.add("5");
        a.add("6");a.add("7");a.add("8");a.add("9");a.add("0");

        Collections.shuffle(a);

        String NIK = "";

        for (String b:a) {
            NIK += b; // NIK = NIK + b;   // a += b --> a = a + b;
        }
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUsername(){
        String[] buffer = nama.split("\\s");
        this.username = buffer[buffer.length - 1];
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
}
