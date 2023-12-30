package Day83;
import java.util.LinkedList;
public class Day83 {
    
    public static void main(String[] args) {
        LinkedList<String> namaOrang = new LinkedList<>();

        // Menambahkan elemen ke LinkedList menggunakan add()
        namaOrang.add("futri");
        namaOrang.add("adriana");
        namaOrang.add("aksar");

        // Menampilkan isi LinkedList
        System.out.println("LinkedList: " + namaOrang);

        // Menggunakan metode size() untuk mendapatkan ukuran LinkedList
        int ukuranLinkedList = namaOrang.size();
        System.out.println("Ukuran LinkedList: " + ukuranLinkedList);
    }
}
