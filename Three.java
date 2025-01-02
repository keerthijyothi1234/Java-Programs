import java.util.Scanner;
class Biggest{

void Numbers(int n1,int n2,int n3){
if(n1>n2 && n1>n3){
System.out.println("n1 is bigger");
}
else if(n2>n1 && n2>n3){
System.out.println("n2 is bigger");
}
else {
System.out.println("n3 is bigger");
}
}
}
public class Three{
public static void main(String args[])
{
System.out.println("enter the numbers");
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
Biggest b1=new Biggest();
b1.Numbers(n1,n2,n3);
}
}

