import java.util.Scanner;

public class SumOfDivisors
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int n;
    int x = 0;

    System.out.println("Input N");
    n = scan.nextInt();

		for(int i = 1; i < n; i = i + 1) {
      if(n % i == 0) {
        x = x + i;
      }
    }
    System.out.println(x);
  }
}