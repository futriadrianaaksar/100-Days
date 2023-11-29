package Day52;
import java.util.Scanner;
public class Main {
    
    public static void data(){
        Scanner input = new Scanner(System.in);
        String nama,alamat;
        byte umur;
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.print("Masukan alamat :");
        alamat = input.nextLine();
        System.out.print("Masukan umur : ");
        umur = input.nextByte();    
        System.out.println("===================\nNama\t: "+nama+"\nUmur\t: "+umur+"\nAlamat\t: "+alamat);
    }
    public static void main(String[] args) {
        
        data();
    }
}
