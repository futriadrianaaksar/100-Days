package Hari49;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka (1-10): "); //untuk menginput angka
        int angka = scanner.nextInt();
        
        if (angka < 1 || angka > 10) {
            System.out.println("Masukkan angka antara 1 hingga 10.");
        } else {
            String romawi = konversiKeRomawi(angka); //konversi ke angks romawi
            System.out.println("Angka Romawi: " + romawi); //menampilkan hasil
        }
    }
    public static String konversiKeRomawi(int angka) { //mengonversi angka ke angka romawi
        String[] romawiSimbol = {"I", "IV", "V", "IX", "X"};
        int[] nilaiAngka = {1, 4, 5, 9, 10};

        StringBuilder hasil = new StringBuilder();
        int indeks = romawiSimbol.length - 1;

        while (angka > 0) {
            if (angka >= nilaiAngka[indeks]) {
                hasil.append(romawiSimbol[indeks]);
                angka -= nilaiAngka[indeks];
            } else {
                indeks--;
            }
        }

        return hasil.toString();
    }
}
