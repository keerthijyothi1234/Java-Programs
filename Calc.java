//program demonstrating different types of methods
public class Calc{
       int var1,var2;
       void sum(){
             int sum=var1+var2;
             System.out.println("sum="+sum);
       }
      //method with returntype
      int sub(){
      int sub=var1-var2;
      return sub;
}//method with parameters
void product(int a,int b){
    int product=a*b;
    System.out.println("product="+product);
}
int div(int a ,int b){
    int quotient=a/b;
    return quotient;
}
public static void main(String args[]){
Calc calc=new Calc();
calc.var1=10;
calc.var2=30;
calc.sum();
int val=calc.sub();
System.out.println("sub"+val);
calc.product(3,5);
System.out.println("div val="+calc.div(40,6));
}
} 