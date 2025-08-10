import java.util.Scanner;
class commonArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,c;
        System.out.println("Enter the number of elements to the Array1:");
        int n1=sc.nextInt();
        System.out.println("Enter the number of elements to the Array2: ");
        int n2=sc.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        System.out.println( "enter the elements to the Array1:");
        for(i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Array 1:");
        for(i=0;i<n1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nEnter the elements to the Array 2:\n ");
        for(i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Array 2:");
        for(i=0;i<n2;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.print("\nThe common elements are:\n");
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                   c=arr1[i];
                   System.out.println(c);
                }
            }
        }
    }
}