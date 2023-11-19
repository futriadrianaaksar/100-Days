package Day42;
 
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner Futri = new Scanner(System.in);
        //buat sebuah program yang menghitung luas persegi panjang dengan meminta input panjang dan lebar 
        int panjang,lebar,hasil;
        
        System.out.print("Panjang : ");
        panjang = Futri.nextInt();
        
        System.out.print("Lebar : ");
        lebar = Futri.nextInt();
        
        hasil = panjang*lebar;
        System.out.println("maka "+panjang+" x "+lebar+" = "+hasil);
        System.out.println("jadi luas nya adalah "+ hasil);
        
    }
    
}
