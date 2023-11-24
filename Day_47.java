package Day47;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("tgs 1 membuat nama hewan minimal 10 index");
        String [] hewan ={"ular","kucing ","sapi ","harimau","singa","kambing","kanguru","panda","burung","ikan"};
        for(int i =0 ; i < hewan.length; i++){
            System.out.println("indeks ke "+i +" = "+hewan[i]);
        }
        System.out.println("\ntgs 2 penjumlahan array");
        int [] angka = {1,3,5,7,9,11,13,15,17,19};
        System.out.println("angka ganjil dalam array \n"+Arrays.toString(angka));
        int jumlah = 0;
        for ( int hasil : angka){
            jumlah += hasil;
        }
        System.out.println("\nhasil jumlah nilai dalam array = "+jumlah);   
   }
}
