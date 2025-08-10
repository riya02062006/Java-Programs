import java.util.Scanner;
class TransMatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("enter the number of rows to the matrix:");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns to the matrix:");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        int trans[][]=new int[c][r];
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
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                trans[j][i]=mat[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println("");
        }


    }
}