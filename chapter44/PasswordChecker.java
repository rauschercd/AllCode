import java.util.Scanner;

public class PasswordChecker {
    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);

        String password;
        String passwordlower;
        String passwordupper;
        Boolean satisfied = false;

        while(!satisfied) {
            System.out.println("Enter a Password");
            System.out.print("> ");
            password = scan.nextLine();
            passwordlower = password.toLowerCase();
            passwordupper = password.toUpperCase();

            if(password.length() >= 7) {
                if(passwordlower != password && passwordupper != password) {
                    if(password.indexOf('1') != -1 || password.indexOf('2') != -1 || password.indexOf('3') != -1 || password.indexOf('4') != -1 || password.indexOf('5') != -1 || password.indexOf('6') != -1 || password.indexOf('7') != -1 || password.indexOf('8') != -1 || password.indexOf('9') != -1 || password.indexOf('0') != -1) {
                        System.out.println("Password set!");
                        satisfied = true;
                    }
                    else {
                        System.out.println("You must have at least 1 number in your password.");
                    }
                }
                else {
                    System.out.println("You must have capital and lowercase symbols in your password.");
                }
            }
            else {
                System.out.println("Your password must be at least 7 characters.");
            }
        }
    }
}