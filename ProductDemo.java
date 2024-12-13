class Product{
//instance variables
String productname;
int productid;
int productprice;
String productType;
static String brandname="Raymonds"; 
//instance method
void productDetails(){
System.out.println("ProductDetails:"+productname+","+productprice+","+productid+","+productType+","+brandname);  //static method  can be access only static variables not the instance variables.we have create the object then we can intialize

}
/*static void getBrand(){
System.out.println(brandname);
}*/
}
public class ProductDemo{
public static void main(String args[]){
call();
Product p1=new Product();
p1.productid=8676;
p1.productname="dress";
p1.productprice=3000;
p1.productType="cloth";
Product.brandname="Raymonds";
//Product.getBrand();
p1.productDetails();

}
public static void call()
{
System.out.println("call method");
}}