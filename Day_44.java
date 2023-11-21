package Day44;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nilaiTugas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai tugas " + (i + 1) + ": ");
            nilaiTugas[i] = scanner.nextDouble();
        }

        // Hitung rata-rata nilainya
        double totalNilai = 0;
        for (double nilai : nilaiTugas) {
            totalNilai += nilai;
        }
        double rataRata = totalNilai / nilaiTugas.length;

        // unuk menentukan predikat
        String predikat;
        if (rataRata >= 90) {
            predikat = "A";
        } else if (rataRata >= 80) {
            predikat = "B";
        } else if (rataRata >= 70) {
            predikat = "C";
        } else if (rataRata >= 60) {
            predikat = "D";
        } else {
            predikat = "E";
        }
        //ini untuk menentukan hasil
        System.out.println("Rata-rata nilai tugas: " + rataRata);
        System.out.println("Predikat: " + predikat);
    }
}
