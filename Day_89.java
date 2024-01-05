package Day89;
import java.util.LinkedList;
public class Day89 {
    
    public static void main(String[] args) {
        LinkedList<String> j = new LinkedList<>();
        j.add("An");
        j.add("na");
        j.add("Ana");

        // Menampilkan isi LinkedList
        System.out.println("LinkedList: " + j);

        // Menggunakan metode poll() untuk menghapus dan mengembalikan elemen teratas
        String pollResult = j.poll();

        // Menampilkan hasil dari poll()
        System.out.println("Hasil dari poll(): " + pollResult);

        // Menggunakan metode pollFirst() untuk menghapus dan mengembalikan elemen pertama
        String pollFirstResult = j.pollFirst();

        // Menampilkan hasil dari pollFirst()
        System.out.println("Hasil dari pollFirst(): " + pollFirstResult);

        // Menggunakan metode pollLast() untuk menghapus dan mengembalikan elemen terakhir
        String pollLastResult = j.pollLast();

        // Menampilkan hasil dari pollLast()
        System.out.println("Hasil dari pollLast(): " + pollLastResult);

        // Menampilkan isi LinkedList setelah menggunakan poll()
        System.out.println("LinkedList setelah poll: " + j);
    }
}
