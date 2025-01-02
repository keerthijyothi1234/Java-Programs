//palindrome
public class Palindrome{
static boolean printPalindrome(int num){
int rem,res=0,temp=num;
while(num>0)
{
rem=num%10;
res=res*10+rem;
num=num/10;
//temp=num;
}
if(res==temp)
return true;
else
return false;

}
public static void main(String args[]){
if(printPalindrome(121))
System.out.println("num is palindrome");
else
System.out.println("num is not palindrome");
}
}