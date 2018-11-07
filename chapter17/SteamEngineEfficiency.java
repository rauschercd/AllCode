import java.util.Scanner;

public class SteamEngineEfficiency
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

	double Tair;
	double Tsteam;
	
	System.out.println("Enter the Air Temperature (k)");
	Tair = scan.nextInt();

	System.out.println("Enter the Steam Temperature (k)");
	Tsteam = scan.nextInt();
	
	if(Tsteam < 373) {
		System.out.println("No Steam! Efficiency 0!");
	}
	else {
	double efficiency = 1 - Tair / Tsteam;
	System.out.println("Efficiency: " + efficiency);
	}
	
  }
}