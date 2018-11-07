import java.util.Scanner;

public class CheckCharge
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

	double checking;
	double savings;
	int checks;
	double total;

	System.out.println("Enter your checking balance: ");
	checking = scan.nextInt();

	System.out.println("Enter your savings balance: ");
	savings = scan.nextInt();

	System.out.println("How many checks do you need?: ");
	checks = scan.nextInt();



	if(checking > 1000 || savings > 1500) {
		System.out.println("No charge! Have a nice day!");
	}
	else{
		total = checks * 0.15;
		System.out.println("Your total is: $" + total + " Have a nice day!");
	}
  }
}