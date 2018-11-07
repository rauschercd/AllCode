import java.util.Scanner;

public class nameecho {
    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);

        String name;
        String name1;
        String name2;
        int slicer;

        System.out.println("Enter your first and last name");
        System.out.print("> ");
        name = scan.nextLine();
        name = name.trim();
        slicer = name.indexOf(' ');
        name1 = name.substring(0, slicer);
        name2 = name.substring(slicer + 1, name.length()).toUpperCase();
        
        System.out.println(name1 + " " + name2);
    }
}