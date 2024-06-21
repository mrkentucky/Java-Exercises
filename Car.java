/*Asssignment 7 
Question 2
MKNMAI001
Maitele Makungo
Part II
 */
public class Car extends Vehicle{
int capacity;
double weight;

public Car(int numCylinders, String manufacturer, Student owner ,int capacity, double weight){
super(numCylinders,manufacturer,owner);
this.capacity=capacity;
this.weight=weight;
}
public Car(Car c){
super(c.cylinders,c.manufacturer,c.owner);
this.capacity=c.capacity;
this.weight=c.weight;
}
@Override
public String toString(){
return manufacturer+", "+cylinders+" cylinders, owned by "+owner.name+", a "+owner.age+
"-year old "+owner.gender+" studying "+owner.getProgramOfStudy()+" at "+owner.getNameOfInstitution()+". "+owner.name+" likes "+owner.getHobbies()+".\n"
+"The car is a "+capacity+"-seater weighing "+weight+" kg";

}

}
