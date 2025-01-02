//read the percentage from console
import java.util.Scanner;
class Percentage{
void Grade(int per){
if(per>80){
System.out.println("first");
}
else if(per>60){
System.out.println("second");
}
else if(per>30){
System.out.println("third");
}
else 
{
System.out.println("fail");
}
}
}
public class Percents{
public static void main(String args[]){
System.out.println("enter the percentage");
Scanner sc=new Scanner(System.in);
int percentage=sc.nextInt();
Percentage p1=new Percentage();
p1.Grade(percentage);
}
}
