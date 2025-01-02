//LOOPS: While, do-while, for
/*while
entry control loop
while(condition){
stmt
}
infinite loop:when we write the condition its go on execution then it is said to be infinite loop.*/
//program to print a table

import java.util.Scanner;
public class Table{
static void printTable(int num){
int i=1;
while(i<=10){
System.out.println(num+"*"+i+"="+num*i);
i++;
}
}
public static void main(String args[]){
System.out.println("enter number for printing table");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printTable(n);
}
}
