/*Asssignment 7 
Question 1
MKNMAI001
Maitele MAkungo */

public class Shape{
String colour;
String name;

public Shape(String name , String colour){
this.name = name;
this.colour=colour;
}

public Shape(Shape shape){
   this.name = shape.name;
   this.colour = shape.colour;
}


public String toString(){
return name+" "+colour+" ";
}




 


}