package Day21;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
         Scanner Futri = new Scanner (System.in);
        
        System.out.print("masukkan kata : ");
        String kata = Futri. nextLine();
        System.out.print("masukkan angka : ");
        byte angka = Futri. nextByte();
        
        System.out.println("kata yang kamu masukkan adalah " + kata);
        System.out.println("angkanya = " + angka);
    }
    
}
