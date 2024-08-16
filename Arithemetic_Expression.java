
import java.util.Scanner;

public class Arithemetic_Expression{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int s=sc.nextInt();

        System.out.println("Enter the common difference: ");
        int m=sc.nextInt();

        System.out.println("Enter the number of terms: ");
        int n=sc.nextInt();
       
        int term=s;
        for (int i=0;i<n;i++){
           System.out.print(term+",");
           
            term=term+m;
           

        }


    }
}