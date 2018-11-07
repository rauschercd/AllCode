import java.util.Scanner;

public class LastChanceGas
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		int capacity;
		int gauge;
		int mpg;
		int math;

		System.out.println("Tank Capacity: ");
		capacity = scan.nextInt();
		System.out.println("Gauge Reading: ");
		gauge = scan.nextInt();
		System.out.println("Miles per gallon: ");
		mpg = scan.nextInt();

		math = ((capacity * gauge) / 100) * mpg;

		if(math > 200) {
			System.out.println("Safe to Proceed");
		} else {
			System.out.println("Get Gas!");
			System.out.println(math);
		}
  }
}