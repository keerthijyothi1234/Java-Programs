//sum of n numbers
import java.util.Scanner;
public class Sum{
static void printSum(int num){
int i=1;
int sum=0;
while(i<=num){
sum+=i;
System.out.println("Sum="+sum);
i++;
}
}
public static void main(String args[]){
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printSum(n);
}
}
