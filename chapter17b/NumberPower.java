import java.util.Scanner;

public class NumberPower
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		double number;
		double power;
		int x = 1;
		double addthis;
		double total = 0;
		double original;
	
		System.out.println("Enter a Number");
		number = scan.nextInt();

		original = number;

		System.out.println("Enter the Power");
		power = scan.nextInt();

		while(x < power) {
			number = number * original;
			System.out.println(number);
			x++;
		}
		System.out.println(number);
  }
}