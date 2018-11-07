import java.util.Scanner;

public class NumberSums
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		int x = 1;
		int numberofnumbers;
		int number;
		int count = 0;

		System.out.println("How many integers will be added:");
		numberofnumbers = scan.nextInt();

		while(x <= numberofnumbers) {
			System.out.println("Enter an Integer:");
			number = scan.nextInt();
			count = count + number;
			x = x + 1;
		}
		System.out.println(count);
  }
}