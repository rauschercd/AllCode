import java.util.Scanner;

public class TirePressure
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

	int rfp;
	int lfp;
	int rrp;
	int lrp;

	System.out.println("Input right front pressure");
	rfp = scan.nextInt();
	System.out.println("Input left front pressure");
	lfp = scan.nextInt();
	System.out.println("Input right rear pressure");
	rrp = scan.nextInt();
	System.out.println("Input left rear pressure");
	lrp = scan.nextInt();

	if(rfp == lfp && rrp == lrp) {
		System.out.println("Inflation is OK");
	}
	else{
		System.out.println("Inflation is not OK");
	}
  }
}