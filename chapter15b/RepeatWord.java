import java.util.Scanner;

public class RepeatWord
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		String word;
		int number = 0;

		System.out.println("Enter a word: ");
	  word = scan.nextLine();
		System.out.println("\r");

		while(number < word.length()) {
			number = number + 1;
			System.out.println(word);
		}
  }
}