package Day100;

public class Day100 {
    
    public static void main(String[] args) {
        // Operator Aritmatika
        int angka1 = 10;
        int angka2 = 5;

        int penjumlahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;
        int perkalian = angka1 * angka2;
        int pembagian = angka1 / angka2;
        int hasilModulo = angka1 % angka2;
        double hasilPangkat = Math.pow(angka1, angka2);

        System.out.println("angka1 + angka2 = " + penjumlahan);
        System.out.println("angka1 - angka2 = " + pengurangan);
        System.out.println("angka1 * angka2 = " + perkalian);
        System.out.println("angka1 / angka2 = " + pembagian);
        System.out.println("angka1 % angka2 = " + hasilModulo);
        System.out.println("Hasil Pangkat = " + hasilPangkat);

        // Operator Penugasan
        int a = 5;
        int b = 2;

        a += b; // a = a + b
        System.out.println("\nNilai a setelah ditambah b: " + a);

        a -= b; // a = a - b
        System.out.println("Nilai a setelah dikurangi b: " + a);

        a *= b; // a = a * b
        System.out.println("Nilai a setelah dikali b: " + a);

        a /= b; // a = a / b
        System.out.println("Nilai a setelah dibagi b: " + a);

        // Operator Perbandingan
        int x = 10;
        int y = 5;

        System.out.println("\nx lebih besar dari y: " + (x > y));
        System.out.println("x lebih kecil dari y: " + (x < y));
        System.out.println("x sama dengan y: " + (x == y));
        System.out.println("x tidak sama dengan y: " + (x != y));
        System.out.println("x lebih besar atau sama dengan y: " + (x >= y));
        System.out.println("x lebih kecil atau sama dengan y: " + (x <= y));

        // Operator Logika
        boolean p = true;
        boolean q = false;

        boolean hasilAnd = p && q;
        boolean hasilOr = p || q;
        boolean hasilNot = !p;

        System.out.println("\nHasil p AND q: " + hasilAnd);
        System.out.println("Hasil p OR q: " + hasilOr);
        System.out.println("Hasil NOT p: " + hasilNot);
    }
}
