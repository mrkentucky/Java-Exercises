/*Asssignment 7 
Question 2
MKNMAI001
Maitele Makungo
Part II
 */
 
public class Vehicle{

int cylinders;
String manufacturer;
Student  owner;

public Vehicle(int numCylinders, String maker, Student owner){
cylinders=numCylinders;
manufacturer=maker;
 this.owner=owner;

}
public Vehicle(Vehicle v){
this.cylinders=v.cylinders;
this.manufacturer=v.manufacturer;
this.owner=v. owner;
}

public String toString(){
return "Number of cylinders: "+cylinders+" Manufacturer: "+manufacturer+" Owner: "+ owner;
}


}
