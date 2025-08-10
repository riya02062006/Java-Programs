    import java.util.Scanner;
class descentArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,temp,j;
        System.out.println("Enter the number of elements to the Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements to the Array:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
        }
            
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println("Array in descending order is: ");
        for(i=0;i<n;i++){

                 System.out.print(arr[i]+" ");
            }
          
        }
}



         
    

    
