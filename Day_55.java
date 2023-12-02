package seratushari;
public class Futri {
    public static void main(String[] args) {
        Futri imute = new Futri();
        String nama = "ana";
        int angka = imute.menghitung(nama);
        System.out.println("jumlah karakter dalam nama sebanyak : "+angka);  
    }
    public static int menghitung(String oct){
        return oct.length();
    }
}
