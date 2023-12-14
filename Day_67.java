package Day67;

public class hari67 {
    
    public static void main(String[] args) {
        StringBuffer ana = new StringBuffer("Futri");
        System.out.println("sebelum : " + ana);
        ana.deleteCharAt(2);
        System.out.println("sesudah : " + ana);
        
        System.out.println("________________");
        
        StringBuilder onas = new StringBuilder("adriana");
        System.out.println("sebelum : " + onas);
        onas.deleteCharAt(6);
        System.out.println("sesudah : " + onas);
    }
}
