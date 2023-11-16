package Day39;

public class Main {
    
    public static void main(String[] args) {
        //array
        int [] angka = {1,2,3,4,5,6,7,8,9,10}; //kurung siku menandakan array
        //cara pertama :(
        // for integee i : angka itu untuk menampilkan isi dari array
        for (int i : angka) {
            System.out.println("Nomor\t:  "+i);
            // /t untuk tab
        }
        //cara ke dua :)
        for(int i =0; i<= angka.length; i++){
            // for integer i = 0 i lebih kecil dari angka.length " angka.length itu adalah cara intuk mengetahui jumlah index dari array
            System.out.println(angka[i]);
            //disini kita memanggil angka[i]
        }
    }
    
}
