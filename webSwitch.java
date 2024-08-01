
import java.util.Scanner;

public class webSwitch{
    public static void main(String[] args) {
        System.out.println("Enter a website: ");
        Scanner sc =new Scanner(System.in);
        String domain =sc.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);

        switch(ext)
        {
            case "com":System.out.println("Commercial");
            break;

            case "org":System.out.println("Organisation");
            break;

            case " net":System.out.println("network");
            break;

            case "gov": System.out.println("Government");
            break;

            case "co.in": System.out.println("Commercial India");
            break;

            default: System.out.println("Invalid");
            break;
        }
    }
}