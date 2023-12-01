package Day54;

public class Main {
    
    public static void main(String[] args) {
        int angka,angka1;
        angka = 37;
        angka1 = 5;
        System.out.println("Operator penjumlahan \n"+ angka +" + "+angka1+" = "+akhir(angka, angka1, angka));
        
    }
    public static int akhir( int angka, int angka1 , int hasil){
    hasil = angka + angka1;
    return (hasil);
    }
}
