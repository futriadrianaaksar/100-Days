package Biodata;
public class Hari98 {
        String nama;
        int umur;
        String jurusan;
    
    public Hari98(String nama, int umur,String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }
    public void tampil(){
        System.out.print("nama : "+nama);  
        System.out.print("\numur : "+umur);  
        System.out.print("\njurusan : "+jurusan);  
    }
    public static void main(String[] args){
        Hari98 nama = new Hari98("Ana",19,"Informatika");
        nama.tampil();
    }
}
