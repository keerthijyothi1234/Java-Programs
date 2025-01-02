//classes and object
class Vehicle{
int speed;
int capacity;
int wheels;
String name;
void vehicleinfo(){
System.out.println(speed+","+capacity+", "+wheels+","+name);
}
}
public class VehicleDemo{
public static void  main(String args[]){
Vehicle v1=new Vehicle();
v1.speed=280;
v1.capacity=5;
v1.wheels=4;
v1.name="Benz";
v1.vehicleinfo();
}
}
