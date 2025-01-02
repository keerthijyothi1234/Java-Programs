//do while
/*exit control loop
do{
//stmt
while(condition)
}*/
import java.util.Scanner;
public class Factorial{
static void printFactorial(int num){
int res=1;
do{
res*=num;
num--;
}
while(num>0);
System.out.println(""+res);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
printFactorial(6);
}
}