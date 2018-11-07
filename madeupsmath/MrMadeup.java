import java.util.Scanner;

public class MrMadeup
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int numberofnumbers = 0;
        int highestquiz = 0;
        int lowestquiz = 0;
        int quizadd;
        int quiztotal = 0;
        int finaltotal = 0;
        String quizstring = "";

        while(quizstring.length() == 0) {
            System.out.println("Enter a Quiz Grade: ");
            quizadd = scan.nextInt();
            if(quizadd > highestquiz) {
                highestquiz = quizadd;
            }
            if(quizadd < lowestquiz) {
                lowestquiz = quizadd;
            }
            quiztotal = quiztotal + quizadd;
            numberofnumbers = numberofnumbers + 1;
            quizstring = Integer.toString(quizadd);
        }
        quiztotal = quiztotal - lowestquiz - highestquiz;
        finaltotal = quiztotal/(numberofnumbers-2);
    }
}