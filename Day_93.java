package hari93;
import java.util.LinkedList;
import java.util.Queue;
public class hari93 {
    
    public static void main(String[] args) {
        Queue<String> a = new LinkedList<>();
        a.add("Januari");
        a.add("Februari");
        a.add("Maret");

        System.out.println("Bulan Queue: " + a);
        System.out.println("Elemen yang di-poll: " + a.poll());
        a.offer("April");
        System.out.println("Bulan Queue setelah offer: " + a);
        System.out.println("Elemen pertama: " + a.peek());
        System.out.println("Elemen yang di-remove: " + a.remove());
        System.out.println("Bulan Queue setelah remove: " + a);
    }
}
