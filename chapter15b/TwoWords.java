import java.util.Scanner;

public class TwoWords
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

		String word1;
		String word2;
		int i = 0;

		System.out.println("Enter First Word:");
		word1 = scan.nextLine();

		System.out.println("Enter Second Word:");
		word2 = scan.nextLine();

		System.out.print(word1);

		while(i <= 30 - word1.length() - word2.length()) {
			System.out.print(".");
			i++;
		}

		System.out.print(word2);
  }
}