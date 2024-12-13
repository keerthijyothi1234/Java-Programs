public class Ternary{
public static void main(String args[])
{
int val1=20;
int val2=30;
int val3=40;
 
int max=val1>val2?(val1>val3?val1:val3):(val2>val3?val2:val3);
System.out.println(max);

}
}
