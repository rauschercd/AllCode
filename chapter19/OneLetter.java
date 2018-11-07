import java.util.Scanner;

public class OneLetter
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		String word;
		int x = 0;

		System.out.println("Enter a word: ");
		word = scan.nextLine();

		while(x < word.length()) {
			System.out.println(word.charAt(x));
			x++;
		}
  }
}