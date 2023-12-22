package hari75;
import java.util.ArrayList;
import java.util.Vector;

public class hari75 {
    
    public static void main(String[] args) {
        ArrayList <Object> a = new ArrayList<>();
           Vector <Object> b = new Vector<>();
           
           a.add("Nama\t: futri");
           a.add("Usia\t: "+19);
           a.add("Alamat\t: tapalang");;
           System.out.println("ArrayList :\n");
           for(Object arraylist : a){
               System.out.println(arraylist);
           }
           System.out.println("\nVektor :\n");
           b.add("Tinggi\t\t= "+160.0f);
           b.add("Berat\t\t= "+53.0);
           b.add("bersuadara\t="+'3');
           for(Object vektor : b){
               System.out.println(vektor);
           }
    }
    
}
