package hari15;
import java.math.BigInteger;
public class Main {
    
    public static void main(String[] args) {
        BigInteger a,b,c,d,e,f,j,k;
    a = new BigInteger("125000000");
    b = new BigInteger("356000000");
    c = new BigInteger("450000000");
    d = new BigInteger("500000000");
    e = a.add(b);
    System.out.println(e);
    f = a.multiply(b);
    System.out.println(f);
    f = a.multiply(c);
    System.out.println(f);
    f = a.multiply(d);
    System.out.println(f);
    j = d.subtract(c);
    k =c.divide(a);
    System.out.println(j+"\n"+k);
    }
    
}
