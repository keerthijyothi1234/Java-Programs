//write the program to calculate the area and perimeter of circle
public class Circle{
        int r;
        void area(){
             double area=3.14*r*r;
             System.out.println("area="+area);
             }
double perimeter(int rad){
          double perimeter=2*3.14*rad;
          return perimeter; 
}
public static void main(String args[]){
    Circle circle=new Circle();
    circle.r=30;
    circle.area();
    System.out.println("perimeter="+circle.perimeter(50));
}
} 