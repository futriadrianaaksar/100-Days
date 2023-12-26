package Day79;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Collections;
public class Day79 {
    
    public static void main(String[] args) {
        // ArrayList untuk buah-buahan
        ArrayList<String> buahBuahan = new ArrayList<>();

        // Menambahkan buah ke ArrayList
        buahBuahan.add("Apel");
        buahBuahan.add("Jeruk");
        buahBuahan.add("Pisang");

        // Mendapatkan buah dari ArrayList
        String buahPadaIndex1 = buahBuahan.get(1);
        System.out.println("\nBuah pada indeks 1: " + buahPadaIndex1);

        // Mengatur nilai buah di ArrayList
        buahBuahan.set(1, "Jeruk Bali");

        // Mendapatkan ukuran ArrayList
        int ukuranBuahBuahan = buahBuahan.size();
        System.out.println("\nUkuran ArrayList buah-buahan: " + ukuranBuahBuahan);

        // Mendapatkan indeks dari suatu buah di ArrayList
        int indeksBuah = buahBuahan.indexOf("Jeruk Bali");
        System.out.println("Indeks 'Jeruk Bali': " + indeksBuah);

        // Memeriksa apakah ArrayList kosong
        boolean isEmpty = buahBuahan.isEmpty();
        System.out.println("\nApakah ArrayList buah-buahan kosong? " + isEmpty);

        // Menghapus buah dari ArrayList
        buahBuahan.remove("Jeruk Bali");

        // Mengubah ArrayList menjadi array
        String[] arrayDariBuahBuahan = buahBuahan.toArray(new String[0]);

        // Memeriksa apakah ArrayList mengandung suatu buah
        boolean mengandungJeruk = buahBuahan.contains("Jeruk");
        System.out.println("\nApakah ArrayList buah-buahan mengandung 'Jeruk'? " + mengandungJeruk);

        // Mengurutkan buah-buahan dalam ArrayList
        Collections.sort(buahBuahan);

        // Vector untuk buah-buahan
        Vector<String> vectorBuah = new Vector<>();

        // Menambahkan buah ke Vector
        vectorBuah.add("Mangga");
        vectorBuah.add("Semangka");
        vectorBuah.add("Anggur");

        // Menampilkan buah-buahan dalam Vector
        System.out.println("\nBuah-buahan dalam Vector:");
        for (String buah : vectorBuah) {
            System.out.println(buah);
        }
    }
}
