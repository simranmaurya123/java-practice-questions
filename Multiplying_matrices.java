public class Multiplying_matrices{
    public static void main(String[]args){
         
        int A[][]={{3,5,9},{4,6,8},{5,6,3}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};

        int C[][]=new int[3][3];
        //METHOD 1
        for (int i = 0; i <A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                C[0][0]=A[0][0]*B[0][0]+A[0][1]*B[1][0]+A[0][2]*B[2][0];
                C[0][1]=A[0][0]*B[0][1]+A[0][1]*B[1][1]+A[0][2]*B[2][1];
                C[0][2]=A[0][0]*B[0][2]+A[0][1]*B[1][2]+A[0][2]*B[2][2];

                C[1][0]=A[1][0]*B[0][0]+A[1][1]*B[1][0]+A[1][2]*B[2][0];
                C[1][1]=A[1][0]*B[0][1]+A[1][1]*B[1][1]+A[1][2]*B[2][1];
                C[1][2]=A[1][0]*B[0][2]+A[1][1]*B[1][2]+A[1][2]*B[2][2];

                C[2][0]=A[2][0]*B[0][0]+A[2][1]*B[1][0]+A[2][2]*B[2][0];
                C[2][1]=A[2][0]*B[0][1]+A[2][1]*B[1][1]+A[2][2]*B[2][1];
                C[2][2]=A[2][0]*B[0][2]+A[2][1]*B[1][2]+A[2][2]*B[2][2];

                System.out.print(C[i][j]+" ");
                
            }

            System.out.println(" ");
        }    
        // METHOD 2

        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <A[i].length; j++) {
                C[i][j]=0;

                for(int k = 0; k <3; k++) {

                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }   
            }  
        }
        for(int x[]:C){
            for(int y:x){
                System.out.print(y+ " ");
            }
            System.out.println(" ");
        }
    
    
    }

}