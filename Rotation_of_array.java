public class Rotation_of_array{
    public static void main(String[] args) {
        int A[]={1,4,5,7,56,45,34,77,88,23};
        int temp=A[0];
        int m;
        
        for (int x:A) {
            System.out.print(x+", ");
            
        }
        System.out.println("");
        System.out.println("Rotated order: ");

        for(int i=1;i<A.length;i++){
            m=A[i];
            int n=m;
         
         System.out.print(A[i]+", ");
            
        }

        int B[]={1,3,56,7,8,5,6,34,90,20};
        A[A.length-1]=temp;
        System.out.print(A[9]);

        System.out.println("");
        
        // Right rotation
        int temp2=A[A.length-1];
        
         for (int i=A.length-1;i>0;i--){
           A[i]=A[i-1];
           System.out.print(A[i]+" ");
           
         }
         A[0]=temp2;
         System.out.println("Shifted Array: ");
         

         for(int j=0;j<A.length;j++){
            System.out.print(A[j]+", ");
         }
    
    }
}