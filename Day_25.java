package Day25;

public class Main {
    
    public static void main(String[] args) {
        byte angka,angka1,angka2;
        angka = 20;
        angka1 = 25;
        angka2 = 30;
        
        boolean bandingkan = angka < angka1;
        boolean banding = angka2 < angka;
        boolean  perbandingan = bandingkan || angka > angka2 ;//true krn salah satunya true
        System.out.println(perbandingan);
        perbandingan = bandingkan && banding;// false krn nilainya harus true kapan salah satunya false maka hasilnya false
        System.out.println(perbandingan);
    }
    
}
