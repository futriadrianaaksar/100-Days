package Hari74;
    
    class kelahiran{
        String nama;
        int tahun;
        
        void tampilkaninfo(){
            System.out.println("nama saya\t :  "+nama+"\nlahir pada tahun : "+tahun);
        }
    }
    public class hari74{
        
        public static void main(String[] args) {
            kelahiran saya = new kelahiran();
            saya.nama = "Futri";
            saya.tahun = 2004;
            saya.tampilkaninfo();
        }
    }
