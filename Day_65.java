package Day65;

public class Day65 {
    
    public static void main(String[] args) {
        // dibawah ini untuk menentukan string yg akan dibandingkan
        String string1 = "Hello";
        String string2 = "hElLo";

        // Membandingkan kedua string tanpa memperhatikan huruf besar/kecilnya
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Kedua string sama.");
        } else {
            System.out.println("Kedua string berbeda.");
        }
    }
}
