package Day81;
import java.util.LinkedList;
public class Day81 {
    
    public static void main(String[] args) {
        LinkedList<String> ana = new LinkedList<>();
        ana.add("futri");
        ana.add("ana");
        ana.add("Anaa");
        ana.add("onas");
        ana.add("jonas");
        System.out.println("LinkedList awal: " + ana);
        ana.remove("Tiga");
        System.out.println("\nSetelah menghapus 'Anaa': " + ana);
        ana.remove(1);
        System.out.println("\nSetelah menghapus elemen ke-1: " + ana);
        ana.removeFirst();
        System.out.println("\nSetelah menghapus elemen pertama: " + ana);
        ana.removeLast();
        System.out.println("\nSetelah menghapus elemen terakhir: " + ana);
    }
    
}
