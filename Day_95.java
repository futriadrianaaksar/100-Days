package Day95;
import java.util.HashMap;
import java.util.Map;

public class Day95 {
    
    public static void main(String[] args) {
        Map<String, String> namaBulanMap = new HashMap<>();
        namaBulanMap.put("2", "Februari");
        namaBulanMap.put("3", "Maret");
        namaBulanMap.put("1", "Januari"); // Kunci '1' akan diperbarui dengan nilai baru

        System.out.println("HashMap: " + namaBulanMap);

        namaBulanMap.remove("2");
        System.out.println("HashMap setelah menghapus kunci '2': " + namaBulanMap);

        String nilaiJanuari = namaBulanMap.get("1");
        System.out.println("Nilai untuk kunci '1': " + nilaiJanuari);
    }
}
