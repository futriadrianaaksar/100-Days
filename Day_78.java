package day77;
import java.util.ArrayList;
import java.util.Vector;
public class day76 {
    
    public static void main(String[] args) {
        ArrayList<biodata> ana = new ArrayList<>();
        ana.add(new biodata("ana","Sulawesi Barat"));
        System.out.println("berikut biodata dari ArrayList:");
        for (biodata mahasiswa : ana) {
            System.out.println("Nama\t: " + mahasiswa.getNama() + "\nuniversitas\t: " + mahasiswa.getUn());
        }
        
        System.out.println();
        Vector<data> vector= new Vector<>();
        vector.add(new  data("jonas ",18));
        System.out.println("berikut biodata dari Vector:");
        for (data dt : vector) {
            System.out.println("Nama\t: " + dt.getaku() + "\nUsia\t: " + dt.getUsia());
        }
    }
}
class data{
    private String aku;
    private int usia;
    public data(String aku ,int usia){
        this.aku = aku;
       this.usia = usia;
}
    public String getaku(){
        return aku;
    }
    public int getUsia(){
return usia;
}
}
class biodata {
    private String nama;
        private String un;

  
    public biodata(String nama, String un) {
        this.nama = nama;
        this.un= un;
    }
    public String getNama() {
        return nama;
    }
    public String getUn() {
        return un;
    }
    }
