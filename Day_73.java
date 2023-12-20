package day73;

public class day73 {
    
    private String jenis;
    
    public day73 (String jenis){
        this.jenis = jenis;
        
    }
    public void jenisBinatang(){
        System.out.println("Ini adalah : "+jenis);
    }
    class banyak{
        private int jumlah;
        public banyak(int jumlah){
            this.jumlah = jumlah;
        }
    
    public void total(){
        System.out.println("Banyak hewan "+jumlah+" Berjenis "+jenis);
    }
    }
    public static void main(String[] args) {
        day73 ada = new day73("kelinci");
        ada.jenisBinatang();
        day73.banyak binatang = ada.new banyak(300);
        binatang.total();
    }
    
}
