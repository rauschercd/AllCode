import java.util.Scanner;

import com.sun.javafx.scene.EnteredExitedHandler;

public class AddingIntegers
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		int numin = 0;
		int firstnum = 1;
		int sum = 0;

		System.out.println("Enter first number or 0 to quit: ");
		firstnum = scan.nextInt();

		if(firstnum == 0) {
			System.out.println("No integers were entered.");
		} else{
			System.out.println("Enter an integer or 0 to quit: ");
			numin = scan.nextInt();
			sum = sum + numin;
		}

		sum = sum + firstnum;

		while(numin != 0) {
			System.out.println("Enter an integer or 0 to quit: ");
			numin = scan.nextInt();
			sum = sum + numin;
		}
		System.out.println("Sum: " + sum);
		System.out.println("Bye");
  }
}