package Day22;

public class Main {
    
    public static void main(String[] args) {
        int angka,angka1,penjumlahan,pengurangan,perkalian;
        double pembagian,sisabagi;
        
        angka = 10;
        angka1 = 5;
        
        penjumlahan = angka + angka1;
        pengurangan = angka - angka1;
        perkalian = angka * angka1;
        pembagian = angka / angka1;
        sisabagi = angka % angka1;
        
        System.out.println(penjumlahan+"\n"+pengurangan+"\n"+perkalian+"\n"+pembagian+"\n"+sisabagi);
    }
    
}
