package Day86;
import java.util.LinkedList;
public class Day86 {
    
    public static void main(String[] args) {
        LinkedList<String> namaBuah = new LinkedList<>();
        namaBuah.add("Apel");
        namaBuah.addLast("Jeruk");
        namaBuah.add("Mangga");

        // Menampilkan isi LinkedList
        System.out.println("LinkedList setelah add: " + namaBuah);

        // Menggunakan metode offer() untuk menambahkan elemen ke akhir LinkedList
        namaBuah.offer("Anggur");

        // Menampilkan isi LinkedList setelah menggunakan offer()
        System.out.println("\nLinkedList setelah offer: " + namaBuah);

        // Menggunakan metode offerFirst() untuk menambahkan elemen di awal LinkedList
        namaBuah.offerFirst("Pisang");

        // Menampilkan isi LinkedList setelah menggunakan offerFirst()
        System.out.println("\nLinkedList setelah offerFirst: " + namaBuah);

        // Menggunakan metode offerLast() untuk menambahkan elemen di akhir LinkedList
        namaBuah.offerLast("Durian");

        // Menampilkan isi LinkedList setelah menggunakan offerLast()
        System.out.println("\nLinkedList setelah offerLast: " + namaBuah);
    }
}
