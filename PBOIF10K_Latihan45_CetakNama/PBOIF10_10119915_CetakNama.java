 import java.util.Scanner;
/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Cetak Nama
 */
public class PBOIF10k10119915Latihan45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.print("Masukan nama anda : ");
        String nama = scanner.nextLine();
        System.out.print("Mau cetak nama berapa kali ? : ");
        int jmlCetak = scanner.nextInt();
        printer.cetak(nama, jmlCetak);

        
    }
}