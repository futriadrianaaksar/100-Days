package Day91;
import java.util.LinkedList;
public class Day91 {
    
    public static void main(String[] args) {
        LinkedList<String> namaOrang = new LinkedList<>();
        namaOrang.add("Futri");
        namaOrang.add("Adriana");
        namaOrang.add("Aksar");

        // Menampilkan isi LinkedList menggunakan rekursi
        displayLinkedList(namaOrang, 0);
    }

    // Metode rekursi untuk menampilkan elemen LinkedList
    private static void displayLinkedList(LinkedList<String> list, int index) {
        // Base case: Jika index mencapai ukuran LinkedList, hentikan rekursi
        if (index == list.size()) {
            return;
        }

        // Menampilkan elemen pada index tertentu
        System.out.println("Elemen ke-" + (index + 1) + ": " + list.get(index));

        // Memanggil diri sendiri untuk menampilkan elemen selanjutnya
        displayLinkedList(list, index + 1);
    }
}
