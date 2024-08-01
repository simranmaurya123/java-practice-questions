
import java.util.Scanner;

public class grade_marking{
    public static void main(String[] args) {
        System.out.println("Enter your marks in 1st subject: ");
        Scanner sc =new Scanner(System.in);
        int marks=sc.nextInt();

        System.out.println("Enter your marks in 2nd subject: ");
        Scanner sc2 =new Scanner(System.in);
        int marks2=sc2.nextInt();

        System.out.println("Enter your marks in 3rd subject: ");
        Scanner sc3 =new Scanner(System.in);
        int marks3=sc3.nextInt();

        int total=marks+marks2+marks3;
        int avg=total/3;

        if (avg>=70) {
            System.out.println("A grade");
   
        }
        else if (avg>=60 && avg<70) {
            System.out.println("B grade");

        }
        else if (avg>=50 && avg<60){
            System.out.println("C grade");
        }
        else if (avg>=40 && avg>50){
            System.out.println("D grade");
        }
        else{
            System.out.println("Fail");
        }

    }

}