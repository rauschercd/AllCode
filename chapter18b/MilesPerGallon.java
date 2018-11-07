import java.util.Scanner;

import com.sun.javafx.scene.EnteredExitedHandler;

public class MilesPerGallon
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		double imiles = 0;
		double fmiles = 0;
		double gallons = 0;

		while(imiles >= 0) {
			System.out.println("Initial Miles: ");
			imiles = scan.nextInt();

			if(imiles < 0) {
				System.out.println("Bye!");
				break;
			}

			System.out.println("Final Miles: ");
			fmiles = scan.nextInt();

			System.out.println("Gallons: ");
			gallons = scan.nextInt();

			System.out.println((fmiles - imiles) / gallons);
		}
  }
}