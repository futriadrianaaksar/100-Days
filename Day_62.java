package day62;

public class Main {
    
    public static void main(String[] args) {
        
        String nama ="Nama\t:Futri-umur\t:19th-Alamat\t:Tapalang-Status\t:Mahasiswi ";
        String [] split = nama.split("-");
        for (String data : split) {
            System.out.println(data);
            
        }
    }
}
