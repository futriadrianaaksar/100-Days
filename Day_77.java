package Day77;
import java.util.ArrayList;
import java.util.Vector;
public class Day76 {
        
    
    public static void main(String[] args) {
        ArrayList < String > kata= new ArrayList <String>();
        kata.add("are you okey : ( ?");
        kata.add("come on");
        for(String  i: kata){
            System.out.println(i);
        }
        Vector < String> kabar=new Vector<String>();
        kabar.add("jangan bersedih");
        kabar.add("uangmu yg hilang pasti akan kembali, :)");
        for(String a : kabar){
            System.out.println(a);
        }
    }
}
