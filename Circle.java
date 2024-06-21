/*Asssignment 7 
Question 1
MKNMAI001
Maitele MAkungo */

public class Circle extends Shape{
double radius;
public Circle(String name, String colour,double radius){
super(name,colour);
this.radius=radius;
} 
public Circle(Circle circle){
super(circle.name,circle.colour);
this.radius=circle.radius;
}

public String toString(){
 return "Circle "+colour+" Radius "+radius;
}



}