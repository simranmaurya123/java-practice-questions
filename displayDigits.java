
import java.util.Scanner;

public class displayDigits{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int count=0;
        int r;
        while(n>0){
            r=n%10;
            n=n/10;
            count ++;

            System.out.println(r+" "+ count);


        }
        System.out.println("Total: "+ count);
        

        
        
    }
}