import java.util.Scanner;
class duplinonzero{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n,i,j,flag=0;
       System.out.println("Enter the number of elements to the array:");
       n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the elements :");
       for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("The Array:");
       for(i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println("\nThe New array without duplicate elements:\n");
       for(i=0;i<n;i++){
        if(arr[i]!=0){
        flag=0;
        }
        for(j=0;j<i;j++)
        {
         if(arr[i]==arr[j]){
            flag=1;
            break;
         }
        }
        if(flag==0){
            System.out.print(arr[i]+" ");
            
        }
    }

    }
}
    