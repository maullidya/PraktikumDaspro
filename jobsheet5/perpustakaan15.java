package jobsheet5;
import java.util.Scanner;

public class perpustakaan15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("apakah anda memiliki KTM? (True/False)");
    Boolean ktm = sc.nextBoolean();
    System.out.println("apakah anda sudah registrasi online? (True/False)");
    Boolean registrasi = sc.nextBoolean();
    if (ktm || registrasi) {
        System.out.println("Boleh masuk perpustakaan");
    } else {
        System.out.println("Tidak boleh masuk perpustakaan");
    }
    }
}
