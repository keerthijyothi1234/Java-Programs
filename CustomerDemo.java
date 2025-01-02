//create a class for customer
class Customer{
String Name;
String phno;
int customerid;

void Customerinfo(){
System.out.println(Name+","+phno+","+customerid);
}
}
public class CustomerDemo{
public static void main(String args[]){
Customer cust=new Customer();
cust.Name="Raju";
cust.phno="9685545636";
cust.customerid=786;
cust.Customerinfo();
}
}