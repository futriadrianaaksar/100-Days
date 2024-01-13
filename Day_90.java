package Day90;
import java.util.LinkedList;
public class Day90 {
    
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Ana");
        a.add("putri");
        a.add("anas");

        System.out.println("LinkedList sebelum remove: " + a);
        
        a.remove();
        System.out.println("LinkedList setelah remove: " + a);

        a.removeFirst();
        System.out.println("LinkedList setelah removeFirst(): " + a);

        a.removeLast();
        System.out.println("LinkedList setelah removeLast(): " + a);
    }
}
