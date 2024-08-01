import java.util.Scanner;

public class menu_driven_program{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("MENU"+"\n"+"1. ADD"+"\n"+"2.SUB"+"\n"+"3.MUL"+"\n"+"4.DIV");

        System.out.println("Enter 1st number: ");
        int s=sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int s1=sc.nextInt();
        
        sc.nextLine();
        System.out.println("Enter option in words: ");
        String s2=sc.nextLine();
        String option =s2.toUpperCase();

        switch(option)
        {
            case "ADD": System.out.println("Sum of two numbers is : " + (s+s1));
            break;
            case "SUB": System.out.println("Substraction of two numbers is : " + (s-s1));
            break;
            case "MUL": System.out.println("Multiplication of two numbers is : " + (s*s1));
            break;
            case "DIV": System.out.println("Division of two numbers is : " + (s/s1));
            break;
            default:System.out.println("Invalid");
            break;


        }

    }
}