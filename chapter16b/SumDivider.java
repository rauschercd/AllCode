import java.util.Scanner;

public class SumDivider
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		double number;
		double n = 1;
		double add;
		double count = 0;

		System.out.println("Enter a number:");
		number = scan.nextInt();

		while(n <= number) {
			add = 1.0/n;
			count = count + add;
			n = n + 1;
		}
		System.out.println(count);
  }
}