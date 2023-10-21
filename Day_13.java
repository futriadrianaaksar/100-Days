package Day13;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) { 
        Scanner Futri = new Scanner(System.in); //untuk membuat metode input
        //buatlah program yang mencetak min 5 data pribadi
        String nama,alamat,umur,status,saudara;
        nama ="ana";
        alamat = "tapalang";
        umur = "19 tahun";
        status = "mahasiswi";
        saudara = "3";
        
        System.out.println("perkenalkan sama saya " +nama+ " saya berdomisili di " +alamat+ " umur saya " +umur+ " saya adalah seorang " +status+ " dan saya " +saudara+ " bersaudara");
        
        //buat sebuah program yang menghitung luas persegi panjang dengan meminta input panjang dan lebar dari pengguna
        int panjang,lebar,hasil;
        System.out.print("Panjang : ");
        panjang = Futri.nextInt();
        System.out.print("Lebar : ");
        lebar = Futri.nextInt();
        hasil = panjang*lebar;
        System.out.println(panjang+" x "+lebar+" = "+hasil);
        
        
    }
    
}
