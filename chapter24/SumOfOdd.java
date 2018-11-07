import java.util.Scanner;

public class SumOfOdd
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int n;
    int x = 0;

    System.out.println("Input N");
    n = scan.nextInt();

		for(int i = 1; i <= n; i = i + 2) {
      x = x + i;
      System.out.println(x);
    }
  }
}