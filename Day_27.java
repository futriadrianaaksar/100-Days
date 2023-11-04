package Day27;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("masukan umur : ");
        byte umur = masuk.nextByte();
        if(umur < 15){
            System.out.println("Masi anak anak");
        }else if(umur < 25){
            System.out.println("Fase remaja ");
        }else if (umur <50 ){
            System.out.println("Sudah dewasa ");
        
        }else if(umur > 50 ){
            System.out.println("fase nenek nenek");
        }else{
            System.out.println("Hanya dapat menampung angka ");
            
        }
            
        System.err.println("tetap semangatt");
    }
    
}
