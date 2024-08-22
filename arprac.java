
import java.util.Scanner;

public class arprac{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int arr[][]= new int[3][3];
        int arr2[][]= new int[3][3];
        int result[][]=new int[3][3];

    System.out.println("""
                       Enter the mathematical operator: 
                       SUM
                       SUB
                       MUL""");
    String s1=sc.next().toUpperCase();

    
    
    System.out.println("Enter numbers for first array : ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }
        System.out.println("Enter numbers for Second array : ");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                arr2[i][j]=sc.nextInt();
                
            }
            
        }

        switch (s1) {
            case "SUM" -> {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <arr[i].length; j++) {
                        result[i][j]=arr[i][j]+ arr2[i][j];
                       
                        
                    }
                    System.out.println(" ");
                }
            }
            case "SUB" -> {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <arr[i].length; j++) {
                        
                        result[i][j]=arr[i][j]- arr2[i][j];
                        
                        
                    }
                    System.out.println(" ");
                }
            }
            case "MUL" -> {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <3; j++) {
                        
                        result[i][j]=0;
                        
                        for(int k = 0; k <3; k++) {
                            
                            result[i][j]=result[i][j]+arr[i][k]*arr2[k][j];
                        }
                    }
                    
                } 
                }    
                
            default -> {System.out.println("Invalid");
                  return;
            }  
        }
        System.out.println("The result is: ");
        for(int[]row:result){
            for(int element:row){
                System.out.print(element+" ");
            }
            System.out.println("");
        }

        }        
        
    
    }
