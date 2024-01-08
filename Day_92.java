package hari92;
import java.util.Stack;
public class hari92 {
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("kayu");
        stack.push("pohon");
        stack.push("daun");
      
        System.out.println("Stack: " + stack);

        String poppedItem = stack.pop();
        System.out.println("Elemen yang di-pop: " + poppedItem);

        String topItem = stack.peek();
        System.out.println("Elemen teratas: " + topItem);

        boolean isStackEmpty = stack.empty();
        System.out.println("Apakah Stack kosong? " + isStackEmpty);

        int searchIndex = stack.search("kayu");
        System.out.println("Indeks Item1: " + searchIndex);
    }
}
