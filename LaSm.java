import java.util.Scanner;
class LaSm{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
System.out.println("enter the elements :");
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
int max=arr[0];
int min=arr[0];
for(int i=1;i<5;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
if(arr[i]<min)
{
min=arr[i];
}}
System.out.println("the greatest is"+max);
System.out.println("the smallest is"+min);
}
}