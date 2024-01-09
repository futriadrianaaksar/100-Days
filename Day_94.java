package Day94;
import java.util.HashSet;
public class Day94 {
    
    public static void main(String[] args) {
        HashSet<String> namaBulanSet = new HashSet<>();
        namaBulanSet.add("Januari");
        namaBulanSet.add("Februari");
        namaBulanSet.add("Maret");
      
        System.out.println("HashSet: " + namaBulanSet);

        namaBulanSet.remove("Februari");
        System.out.println("HashSet setelah menghapus 'Februari': " + namaBulanSet);
      
        boolean containsMaret = namaBulanSet.contains("oktober");
        System.out.println("Apakah 'oktober' ada di HashSet? " + containsMaret);
    }
}
