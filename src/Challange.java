import java.util.*;

public class Challange {

    static Registrasi baru = new Registrasi();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        inputNama();
        inputUsia();
        inputJK();
        NIK();
        email();
        username();
        password();
        listData();

    }

    private static void inputNama(){
        System.out.print("Nama : ");
        String nama = input.nextLine();
        baru.setNama(nama);
    }

    private static void inputUsia(){
        System.out.print("Usia : ");
        int usia = input.nextInt();
        baru.setUsia(usia);
    }

    private static void inputJK(){
        System.out.print("Jenis Kelamin (L/P) : ");
        char JK = input.next().charAt(0);

        if (JK == 'L' || JK == 'P'){
            baru.setJenisKelamin(JK);
        } else {
            inputJK();
        }

    }

    private static void NIK(){
        System.out.print("Penginputan NIK\n1. Generate random NIK or Input your NIK\ninput : ");
        String angka = input.next();

        if (angka.equals("1")){
            baru.setNIK();
        } else if (angka.length() == 10){
            baru.setNIK(angka);
        } else {
            System.err.println("NIK yang anda masukkan bukan 10 digit!\n");
            NIK();
        }
    }

    private static void email(){

        System.out.print("Email : ");
        String mail = input.next();

        if (mail.matches("(.*)@gmail.com") || mail.matches("(.*)@webmail.umm.ac.id")){
            baru.setEmail(mail);
        } else {
            System.err.println("Email anda tidak benar");
            email();
        }
    }

    private static void username(){

        System.out.print("New Username\n1. Generate Username or Input your new Username\ninput : ");
        String huruf = input.next();

        if (huruf.equals("1")){
            baru.setUsername();
        } else{
            baru.setUsername(huruf);
        }
    }

    private static void password(){
        System.out.print("Enter New Password : ");

        String pass = input.next();

        if (pass.length() >= 8){
            baru.setPassword(pass);
        } else {
            System.err.println("Password minimal 8 Character!\n");
            password();
        }
    }

    private static void listData(){
        System.out.println("----- Your Data -----");

        System.out.println("Nama          : " + baru.getNama());
        System.out.println("Usia          : " + baru.getUsia());
        System.out.println("Jenis Kelamin : " + baru.getJenisKelamin());
        System.out.println("NIK           : " + baru.getNIK());
        System.out.println("email         : " + baru.getEmail());
        System.out.println("Username      : " + baru.getUsername());
        System.out.println("Password      : " + baru.getPassword());
    }
}
