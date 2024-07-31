
import java.util.Scanner;

public class age_checking{
    public static void main(String[]args){
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if (age<=20) {
            System.out.println("Person is young ");

        }

        else if(age<=50){
            System.out.println("Person is middle aged");

        }
        
        else {
            System.out.println("Person is old");
        }
    }
}