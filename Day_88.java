package Day88;
import java.util.LinkedList;
public class Day88 {
    
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("An");
        a.add("na");
        a.add("Anna");

        // Menampilkan isi LinkedList
        System.out.println("LinkedList: " + a);

        // Menggunakan metode peek() untuk melihat elemen teratas tanpa menghapusnya
        String peekResult = a.peek();

        // Menampilkan hasil dari peek()
        System.out.println("Hasil dari peek(): " + peekResult);

        // Menggunakan metode peekFirst() untuk melihat elemen pertama tanpa menghapusnya
        String peekFirstResult = a.peekFirst();

        // Menampilkan hasil dari peekFirst()
        System.out.println("Hasil dari peekFirst(): " + peekFirstResult);

        // Menggunakan metode peekLast() untuk melihat elemen terakhir tanpa menghapusnya
        String peekLastResult = a.peekLast();

        // Menampilkan hasil dari peekLast()
        System.out.println("Hasil dari peekLast(): " + peekLastResult);

        // Menampilkan isi LinkedList setelah menggunakan peek()
        System.out.println("LinkedList setelah peek: " + a);
    }
}
