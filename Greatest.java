class Greater{
void Greaternum(int n1, int n2){
if(n1>n2)
System.out.println(n1+ "is greatest");
else
System.out.println(n2+ " is greatest");
}
}
public class Greatest{
public static void main(String args[]){
Greater g1=new Greater();
g1.Greaternum(6,9);
}
}

