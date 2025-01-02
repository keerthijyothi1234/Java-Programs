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
public class Percent{
public static void main(String args[]){
Percentage p1=new Percentage();
p1.Grade(60);
}
}
