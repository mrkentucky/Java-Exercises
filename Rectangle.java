/*Asssignment 7 
Question 1
MKNMAI001
Maitele MAkungo */
  
public class Rectangle extends Shape{
double  length;
double width;
public Rectangle(String name, String colour, double length,double width){
super(name , colour);
this.length=length;
this.width=width;
}
public Rectangle(Rectangle rec){
   super(rec.name, rec.colour);
   this.length = rec.length;
   this.width = rec.width;
}
public String toString(){
return "Rectangle "+colour+" Length "+length+" Width "+width;

}


}