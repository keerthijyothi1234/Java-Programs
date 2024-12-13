//write a program to calculate the area and perimeter of rectangle
public class Rect{
        int l,b;
        void area(){
             int area=l*b;
             System.out.println("area="+area);
             }
int perimeter(int len,int bre){
          int perimeter=2*(len+bre);
          return perimeter; 
}
public static void main(String args[]){
    Rect rect=new Rect();
    rect.l=30;
    rect.b=40;
    rect.area();
    System.out.println("perimeter val="+rect.perimeter(40,4));
}
} 