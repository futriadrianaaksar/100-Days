package days85;
import java.util.LinkedList;
public class days85 {
    
    public static void main(String[] args) {
        LinkedList<String> keluarga = new LinkedList<>();
        keluarga.add("Ibu");
        keluarga.add("Ayah");
        keluarga.add("Anak");

        // Menampilkan isi LinkedList
        System.out.println("LinkedList: " + keluarga);

        // Memeriksa apakah LinkedList mengandung suatu elemen
        String elemenCari = "ponakan";
        boolean containsElemen = keluarga.contains(elemenCari);

        // Menampilkan hasil pencarian
        if (containsElemen) {
            System.out.println("LinkedList mengandung elemen '" + elemenCari + "'");
        } else {
            System.out.println("LinkedList tidak mengandung elemen '" + elemenCari + "'");
        }
    }
}
