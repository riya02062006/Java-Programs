import java.util.Scanner;
class FlipRC{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,k,l;
        System.out.println("enter the number of rows to the matrix:");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns to the matrix:");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        int flip[][]=new int[r][c];
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
        if(r>=3&&c>=3){
        int roworder[]={1,2,0};
        int columnorder[]={1,2,0};
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
               flip[i][j]=mat[roworder[i]][columnorder[j]];
              }

               }
               System.out.println("Flipped Matrix:");
               for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    System.out.print(flip[i][j]+" ");
                }
                System.out.println("");
               }
            }
            else{
                System.out.println("Flipping not possible!");
            }
        }
                
            }
        
    
