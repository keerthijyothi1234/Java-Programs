public class Arithmetic {
public static void main(String args[]){
 int num1=22;
  int num2;
  System.out.println(num1);
  num2=++num1;
  System.out.println(num1+" "+num2);
//preincrement
num2=num1++;
System.out.println(num1+" "+num2);
//postincrement
num2=--num1;
System.out.println(num1+" "+num2);
//predecrement
num2=num1--;
System.out.println(num1+" "+num2);
//postdecrement
char ch='a';
System.out.println("ch");
char ch1=++ch;
System.out.println(ch+" " +ch1);
ch1=--ch;
System.out.println(ch+" " +ch1);

}
}