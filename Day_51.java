package Day51;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        String usernameBenar = "Futri123";
        String passwordBenar = "Futri123";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();
        
        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
            System.out.println("Login sukses");
        } else {
            System.out.println("Login gagal");
        }
    }
    }
