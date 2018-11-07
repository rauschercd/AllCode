import java.util.Scanner;

public class TownDump
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

	int checking;
	int savings;
	int checks;
	double finalcost;

	System.out.println("How much do you have in checking?");
	checking = scan.nextint();

	System.out.println("How much do you have in savings?");
	savings = scan.nextint();

	System.out.println("How many checks do you want?");
	checks = scan.nextint();

	if(checking > 1000 || savings > 1500) {
		System.out.println("No Charge!");
	}
	else {
		finalcost = 0.15 * checks;
		System.out.println("Your cost: " + finalcost);
	}
  }
}