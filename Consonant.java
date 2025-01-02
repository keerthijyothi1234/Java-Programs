// java program to check whether input character is a vowel or consonant 

import java.util.Scanner;
class Alphabet{ 

	 
void symbol(char y) {
if (y == 'a' || y == 'e' || y == 'i' || y == 'o'|| y == 'u') 
System.out.println("It is a Vowel"); 
else
System.out.println("It is a Consonant"); 
} 
}

public class Consonant{ 
public static  void main(String args[]) 
{ 
System.out.println("enter a Character");
Scanner sc=new Scanner(System.in);
char alphabet=sc.next().charAt(0);
    Alphabet a1=new Alphabet();
    a1.symbol(alphabet);
    
} 
}
