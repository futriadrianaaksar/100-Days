package Day84;
import java.util.LinkedList;
public class Day84 {
    
    public static void main(String[] args) {
        // Membuat LinkedList
        LinkedList<String> namaBuah = new LinkedList<>();
        namaBuah.add("rambutan");
        namaBuah.add("pepaya");
        namaBuah.add("langsat");

        // Menampilkan isi LinkedList sebelum penggunaan metode set
        System.out.println("LinkedList sebelum set: " + namaBuah);

        // Menggunakan metode set untuk mengubah elemen pada indeks tertentu
        namaBuah.set(1, "kelapa");

        // Menampilkan isi LinkedList setelah penggunaan metode set
        System.out.println("LinkedList setelah set: " + namaBuah);
    }
}
