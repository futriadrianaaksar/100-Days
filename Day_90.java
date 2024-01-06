package Day90;
import java.util.LinkedList;
public class Day90 {
    
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Ana");
        a.add("putri");
        a.add("anas");

        // Menampilkan isi LinkedList sebelum penghapusan
        System.out.println("LinkedList sebelum remove: " + a);

        // Menggunakan metode remove() untuk menghapus elemen tertentu
        a.remove();
        System.out.println("LinkedList setelah remove: " + a);

        // Menggunakan metode removeFirst() untuk menghapus elemen di awal
        a.removeFirst();
        System.out.println("LinkedList setelah removeFirst(): " + a);

        // Menggunakan metode removeLast() untuk menghapus elemen di akhir
        a.removeLast();
        System.out.println("LinkedList setelah removeLast(): " + a);
    }
}
