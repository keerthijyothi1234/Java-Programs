//create class for product
class  Product{
String Name;
String quality;
int productid;
int price;

void Productinfo(){
System.out.println(Name+","+quality+","+productid+","+price);
}
}
public class ProductDet{
public static void main(String args[]){
Product p1=new Product();
p1.Name="cup";
p1.quality="good";
p1.productid=786;
p1.price=80;
p1.Productinfo();
}
}