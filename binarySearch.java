import java.util.Scanner;
class binarySearch{
    public static void main(String args[]){
        int i,j,flag=0,mid,n,temp,key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to the array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Sorting the array in ascending order
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
        }
        System.out.println("The array is: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nEnter the key element: \n");
        key=sc.nextInt();
        int upper=n-1;
        int lower=0;
        while((flag!=1)&&(lower<=upper))
        {
            mid=(lower+upper)/2;
            if(key==arr[mid])
            {
                flag=1;
                break;
            }
           else if(key<arr[mid])
           {
            upper=mid-1;
           }
           else
           {
            lower=mid+1;
           }
           
        }
        if(flag==0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found ");
        }
        }
    }






