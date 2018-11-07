import java.util.Scanner;

public class StartEnd
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

	int startnumber;
	int endnumber;

	System.out.println("Enter Starting Number: ");
	startnumber = scan.nextInt();

	System.out.println("Enter Ending Number: ");
	endnumber = scan.nextInt();

	while(startnumber <= endnumber) {
		System.out.println(startnumber);
		startnumber++;
	}
  }
}