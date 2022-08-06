package movieticketbooking;
import java.util.Scanner;
public class login {

 public static boolean happy()
    {
        String username, password;
        Scanner on = new Scanner(System.in);
        System.out.print("Enter username:");
        username = on.nextLine();
        System.out.print("Enter password:");
        password = on.nextLine();
        if(username.equals("mno") && password.equals("0831"))
        {
            System.out.println("Authentication Successful\n");
            return true;
        }
        else
        {
            System.out.println("Authentication Failed\n");
            return false;
        }
        
    }
}
