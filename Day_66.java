package Day66;
import java.util.Scanner;
public class Day66 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama depan
        System.out.print("Masukkan nama depan: ");
        String namaDepan = scanner.nextLine();

        // Meminta pengguna memasukkan nama belakang
        System.out.print("Masukkan nama belakang: ");
        String namaBelakang = scanner.nextLine();

        // Menghasilkan dan menampilkan pesan sambutan dengan format
        String pesanSambutan = String.format("Halo, %s %s!", namaDepan, namaBelakang);
        System.out.println(pesanSambutan);

        scanner.close();
    }
}
