import java.util.Scanner;

import com.sun.javafx.scene.EnteredExitedHandler;

public class AreaOfRectangles
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		int y1;
		int y2;
		int x1;
		int x2;
		int width = 1;
		int height = 1;
		int area;

		while(width != 0 && height != 0) {
			System.out.println("x1");
			x1 = scan.nextInt();

			System.out.println("y1");
			y1 = scan.nextInt();
			
			System.out.println("x2");
			x2 = scan.nextInt();

			System.out.println("y2");
			y2 = scan.nextInt();

			width = Math.abs(x2 - x1);
			height = Math.abs(y2 - y1);
			area = width * height;

			System.out.println("Width: " + width + " Height: " + height + " Area: " + area);
		}
		System.out.println("Bye!");
  }
}