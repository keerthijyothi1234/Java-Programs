//classes and object
class Vehicle{
int speed;
int capacity;
int wheels;
String name;
void vechicleinfo(){
System.out.println(speed+","+capacity+", "+wheel+","+name);
}
}
public class VehicleDemo{
public static void  main(String args[]){
Vehicle vehicle=new Vehicle();
vehicle.speed=280;
vehicle.capacity=5;
vehicle.wheels=4;
vehicle.name="Benz";
vehicle.vehicleinfo();
}
}
