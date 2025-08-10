import java.util.Scanner;
class SumEven{
public static void main(String[] args){
int[] arr=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter numbers");
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<5;i++)
{
if(arr[i]%2==0)
{
sum=sum+arr[i];
}
}
System.out.println("The sum is "+sum);
}
}








