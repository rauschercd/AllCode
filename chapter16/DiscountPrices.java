import java.util.Scanner;

public class DiscountPrices
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		int cost;
		int newcost;
		int discount;

		System.out.println("Enter amount of purchases: ");
		cost = scan.nextInt();

		if(cost > 1000) {
			discount = (cost / 100) * 10;
			newcost = cost - discount;
			System.out.println("Discounted Price: " + newcost);
		}
		else{
			System.out.println("No discount! Your price: " + cost);
		}
  }
}