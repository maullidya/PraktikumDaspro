package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.println("Apakah UKT sudah lunas? (True/False)");
    Boolean uktLunas = sc.nextBoolean();
    if (uktLunas) {
        System.out.println("Pembayaran UKT Terverifikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    }
    }
}
