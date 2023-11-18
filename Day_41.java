package Day41;
import java.util.Scanner;//pemanggilan liberary Scanner
public class Main {
    
    public static void main(String[] args) {
        
        Scanner futri = new Scanner(System.in);
        int angka, hasil;//deklarasi variabel
        System.out.print("Masukkan angka : ");
        
        angka = futri.nextInt();//fungsi scenner
        hasil = angka % 2;//untuk mengetahui apakah itu genap atau ganjil
        
        if (hasil == 0) {// ketika angka inputan habis di bagi 2 maka itu adalah bilangan genap
            System.out.println(angka + " genap"); 
        }else if(hasil == 1){// ketika angka inputan tidak habis di bagi 2 maka itu adalah bilangan ganjil
            System.out.println(angka + " ganjil");
        }
        
    }
    
}
