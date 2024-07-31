
import java.util.Scanner;

public class dayname{
    public static void main(String[] args) {
       System.out.println("Enter the day of week"); 
       Scanner sc=new Scanner(System.in);
       int dno=sc.nextInt(); 


       if (dno==1){
        System.out.println("Monday");
       }
       else if (dno==2){
        System.out.println("Tuesday");
       }
       else if (dno==3){
        System.out.println("Wednesday");
       }
       else if (dno==4){
        System.out.println("Thursday");
       }
       else if (dno==5){
        System.out.println("Friday");
       }
       else if (dno==6){
        System.out.println("Saturday");
       }
       else if(dno==7){
        System.out.println("Sunday");
       }
       else {
        System.out.println("Invalid day number");
       }
    }
}