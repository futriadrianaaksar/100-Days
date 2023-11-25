package Day48;

public class Main {
    
    public static void main(String[] args) {
        
        int tinggi = 5; // bisa di ganti dengan tinggi segitiga yang diinginkan

        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
