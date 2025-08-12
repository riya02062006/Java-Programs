import java.util.Scanner;
import mypackage.MyFunction;

public class Display{
public static void main(String[]args){
int n,m;

Scanner input = new Scanner(System.in);
MyFunction in=new MyFunction();


System.out.println("Enter your 1 st number:");
n=input.nextInt();
System.out.println("Enter your 2nd number:");
m=input.nextInt();

int add=in.sum(n,m);
System.out.println("Sum="+add);
int subtraction=in.diff(n,m);
System.out.println("Subtraction="+subtraction);
int Multiplication=in.multiply(n,m);
System.out.println("Multiplication="+Multiplication);
}}