import java.util.Scanner;

/*
 * 1. (Refer to Sel8)
 * Password = "happy"
 * Ask the user for a password. If password is correct, output “you are logged in” if not,
then output “incorrect password”. Have the user re-enter the password until he/she
gets is right.
 */

public class All1 {
    public static void main(String[] args) {
        secret_word("happy");
    }

    public static void secret_word(String x){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = input.nextLine();

        while(!password.equals(x)){
            System.out.println("incorrect password");
            System.out.println("Enter your password");
            password = input.nextLine();
            
        }
        System.out.println("Logged in!");

        input.close();
        
    }
}
