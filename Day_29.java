package Day29;

public class Main {
    
    public static void main(String[] args) {
        int angka = 15;
        String nilai = ( angka < 5 ) ? "lebih kecil dari 5" : "lebih dari atau sama dengan 5";
        System.out.println(nilai);
        //jika angka lebih kecil dari 5 itu salah,maka yang muncul adalah "lebih dari atau sama dengan 5"
        //sebaliknya, jika angka lebih kecil dari 5 itu benar, maka yang muncul adalah "lebih kecil dari 5".
    }
    
}
