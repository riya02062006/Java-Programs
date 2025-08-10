import java.util.Scanner;
class diagonalSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,sum=0;
        System.out.println("enter the number of rows to the matrix:");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns to the matrix:");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter the  elements to the matrix :");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(" Matrix :");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println("");
        }
        if(r!=c){
            System.out.println("Summation of Diagonal Elements not possible with unequal dimension");
        }
        else{
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(i==j){
                 sum=sum+mat[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal Elements:"+sum);
            }
        }
    }
