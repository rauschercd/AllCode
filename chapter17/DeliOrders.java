import java.util.Scanner;

public class DeliOrders
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

	String item;
	double price;
	double deliveryprice = 2.0;
	int overnight;
	double total;

	System.out.println("Enter the item: ");
	item = scan.nextLine();

	System.out.println("Enter the price: ");
	price = scan.nextInt();

	System.out.println("Overnight delivery? (0==no, 1==yes)");
	overnight = scan.nextInt();

	System.out.println("Invoice:");
	System.out.println(item);
	System.out.println("Price: " + price);
	if(overnight == 1 && price < 10) {
		deliveryprice = deliveryprice + 3.0;
	}
	System.out.println("\rDelivery " + deliveryprice);
	total = deliveryprice + price;

	System.out.println("Total " + total);
  }
}