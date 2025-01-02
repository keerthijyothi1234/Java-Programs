// program to check whether a number is a Strong number or not


import java.util.Scanner;

public class Strong{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        scanner.close();

        if (isStrongNum(num)) {
            System.out.println(num + " is a Strong num");
        } 
        else {
            System.out.println(num + " is not a Strong num");
        }
    }

    public static boolean isStrongNum(int num) {
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
//program for num is prime or not at given range

public class Prime {
	static void loop(int range) {
     for(int n=2;n<=range;n++) {
    	 int i;
    	 boolean b= false;
		for(i=2; i<= n/2;i++) {
           
         if(n % i == 0) {
                    b= true;
                    break;
                }
            }
           if(!b)
        	   System.out.println(n);
	}
}
            public static void main(String[] args) {
            loop(50);
        }
    }
