import java.util.Scanner;
class ReverseRow{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("enter the number of rows to the matrix:");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns to the matrix:");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        int rev[][]=new int[r][c];
         System.out.println("Enter the  elements to the matrix :");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(" Orginal matrix :");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Reversed Matrix:");
        for(i=0;i<r;i++){
           int k=0;
            for(j=c-1;j>=0;j--)
            {
                rev[i][k]=mat[i][j];
                k++;
             }
            }
         

        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
               System.out.print(rev[i][j]+" ");
            }
            System.out.println("");
        }
    }
}