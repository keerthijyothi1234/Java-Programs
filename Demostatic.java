class Demo{
 static{
 System.out.println("Static Block");//when we have to access the static method first we have to intialise the class
}
static void mess(){
    System.out.println("Static Block");
}
}
public class Demostatic{
   public static void main(String args[]){
   //Demo d=new Demo();
   Demo.mess();
}
}