
import java.util.Scanner;

public class radix{
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String stnum=sc.nextLine();

        if (stnum.matches("[01]+")) {
         System.out.println("Binary Radix=2");   
        }

        else if(stnum.matches("[0-7]+")){
            System.out.println("Octal 8");
        }
        else if(stnum.matches("[0-9][[a-f]|[A-F]]+")){
            System.out.println("Hexa 16");
        }
        else if (stnum.matches("[0-9]+")){
            System.out.println("Decimal 10");
        }
        else {
            System.out.println("Invalid text");
        }


    }
}