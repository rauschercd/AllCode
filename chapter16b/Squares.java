import java.util.Scanner;

public class Squares
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		double x = 1;
		double numberofnumbers;
		double number;
		double numbertotal = 0;
		double squarednumber;
		double squarednumbertotal = 0;
		double average = 0;
		double average1 = 0;
		double average2 = 0;
		double SD = 0;

		System.out.println("How many integers will be added:");
		numberofnumbers = scan.nextInt();

		while(x <= numberofnumbers) {
			System.out.println("Enter an integer:");
			number = scan.nextInt();
			numbertotal = numbertotal + number;
			squarednumber = number*number;
			squarednumbertotal = squarednumbertotal + squarednumber;
			average = numbertotal/numberofnumbers;
			average1 = average * average;
			average2 = squarednumbertotal/numberofnumbers;
			SD = Math.sqrt(average2 - average1);
			x = x + 1;
		}
		System.out.println("Total Sum of Numbers: " + numbertotal);
		System.out.println("Total Sum of Squared Numbers: " + squarednumbertotal);
		System.out.println("Sum of Numbers Averaged, then Squared: "  + average1);
		System.out.println("Sum of Squared Numbers Averaged: " + average2);
		System.out.println("Standard Deviation: " + SD);
  }
}