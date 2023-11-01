package Hari24;

public class Main {
    
    public static void main(String[] args) {
        int angka1 = 5;
        int angka2 = 7;
        
        boolean pertama,kedua,ketiga,keempat,kelima;
        
        pertama = angka1 < angka2;
        kedua = angka1 > angka2;
        ketiga = angka1 != angka2;
        keempat = angka1 == angka2;
        kelima = angka1 <= angka2;
        
        System.out.println(pertama+"\n"+kedua+"\n"+ketiga+"\n"+keempat+"\n"+kelima);
    }
    
}
