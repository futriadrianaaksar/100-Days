package Day33;

public class Main {
    
    public static void main(String[] args) {
        
        int angka= 50;
        //mulai dari angka nol sampai angka 50 akan di tambah dengan angka 2
        for (int i = 0; i < angka; i+=5) {
            System.out.println(i);
            }
        //ketika sudah sampai mencapai angka 50, maka akan di kurangi dengan angka 2 lagi sampai angka 0
                for (int j= angka ; j > 0; j-=5) {
                    System.out.println(j);
                }
            
        }

}
