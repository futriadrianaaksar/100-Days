package Day87;
import java.util.LinkedList;
public class Day87 {
    
    public static void main(String[] args) {
        LinkedList<String> namaBulan = new LinkedList<>();
        namaBulan.push("Januari");
        namaBulan.push("Februari");
        namaBulan.push("Maret");

        // Menampilkan isi LinkedList setelah push
        System.out.println("LinkedList setelah push: " + namaBulan);

        // Menggunakan metode pop() untuk menghapus elemen dari atas LinkedList
        String bulanPop = namaBulan.pop();

        // Menampilkan elemen yang di-pop dan isi LinkedList setelah pop
        System.out.println("Bulan yang di-pop: " + bulanPop);
        System.out.println("LinkedList setelah pop: " + namaBulan);
    }
}
