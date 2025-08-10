import java.util.Scanner;
class SumMatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("enter the number of rows to the matrix1:");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns to the matrix1:");
        int c1=sc.nextInt();
        System.out.println("Enter the number of rows to the matrix2:");
        int r2=sc.nextInt();
        System.out.println("Enter the number of Columns to the matrix2:");
        int c2=sc.nextInt();
        int mat1[][]=new int[r1][c1];
        int mat2[][]=new int[r2][c2];
        int sum[][]=new int[r1][c1];
        System.out.println("Enter the  elements to the matrix 1:");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("MATRIX 1:");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                System.out.print(mat1[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Enter the  elements to the matrix 2:");
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("MATRIX 2:");
         for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                System.out.print(mat2[i][j]+ " ");
            }
            System.out.println("");
        }
        if((r1!=r2)||(c1!=c2)){
            System.out.println("Addition not possible with unequal dimensions");
        }
        else{
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    sum[i][j]=mat1[i][j]+mat2[i][j];
                }
            }
            System.out.println("SUM:");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println("");
            }
        }

    }
}
