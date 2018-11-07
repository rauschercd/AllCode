import java.util.Scanner;

import com.sun.javafx.scene.EnteredExitedHandler;

public class InRangeAdder
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		int lowrange;
		int highrange;
		int num = 1;
		int inrange = 0;
		int outrange = 0;

		System.out.println("Enter low range: ");
		lowrange = scan.nextInt();

		System.out.println("Enter high range: ");
		highrange = scan.nextInt();

		while(num != 0) {
			System.out.println("Enter Data: ");
			num = scan.nextInt();

			if(num > highrange || num < lowrange) {
				outrange = outrange + num;
			} 
			else {
				inrange = inrange + num;
			}
		}
		System.out.println("Sum of in range values: " + inrange);
		System.out.println("Sum of out of range values: " + outrange);
  }
}