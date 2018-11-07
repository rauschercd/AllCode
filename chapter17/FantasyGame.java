import java.util.Scanner;

public class FantasyGame
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

	String name;
	int strength; 
	int health; 
	int luck;

	System.out.println("Welcome to the game!");

	System.out.println("Enter your name");
	name = scan.nextLine();

	System.out.println("Enter strength (1-10)");
	strength = scan.nextInt();

	System.out.println("Enter health(1-10)");
	health = scan.nextInt();

	System.out.println("Enter luck(1-10)");
	luck = scan.nextInt();

	if((strength + health + luck) > 15) {
		strength = 5;
		health = 5;
		luck = 5;
		System.out.println("You have given your character too many points! Default values have been given: " + name + " Strength: " + strength + " Health: " + health + " Luck: " + luck);
	}
	else{
		System.out.println("Points set! " + name + " Strength: " + strength + " Health: " + health + " Luck: " + luck);
	}
  }
}