package Day35;

public class Main {
    
    public static void main(String[] args) {
        
        byte angka = 5;
        System.out.println("perulangan while");
        // dimana perulangan while itu langsung masuk kondisi berbeda dengan for yang di mna nilai awalnya itu hars di ketahui terlebih dahulu
        while(angka <= 10){
            System.out.println(angka);
            angka++;
        }
        System.out.println("perulangan do while");
        // sedangkan perulangan doo while langsung masuk prose berbeda dengan while yang mengecek dulu kondisi baru di proses
        do{
            System.out.println(angka);  
            angka--;
        }while(angka >= 1);
    }

    }
