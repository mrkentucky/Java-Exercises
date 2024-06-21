/*Asssignment 7 
Question 2
MKNMAI001
Maitele Makungo
Part II Last
 */
 
import java.util.Scanner;
public class Question2{
public static void main(String args[]){
 Scanner input= new Scanner(System.in);
 
 System.out.println("Enter the vehicle manufacturer:");
 String manufa=new String(input.nextLine());
     
System.out.println("Enter the name of the vehicle owner:");
   String name = new String(input.nextLine());
   
   System.out.println("Enter the owner's gender:");
   String gender = new String(input.nextLine());
   
   System.out.println("Enter the owner's programme of study:");
   String studypro = new String(input.nextLine());
   
   System.out.println("Enter the owner's Institution name:");
   String institution = new String(input.nextLine());
     
   System.out.println("Enter the owner's hobbies:");
   String hobbie = new String(input.nextLine());
   
   System.out.println("Enter the owner's age:");
   int age = input.nextInt();
   
   System.out.println("Enter the number of cylinders in the engine:");
   int nocyl = input.nextInt();
   
   System.out.println("Enter the car seating capacity:");
   int cap= input.nextInt();
   
   System.out.println("Enter the weight of the car:");
   double weight = input.nextDouble();
   Student student= new Student(name,age,gender,institution,studypro,2,hobbie);

   Vehicle v= new Vehicle(nocyl,manufa,student);
   
   Car c=new Car(nocyl,manufa,student,cap, weight);
   System.out.print(c);








}

}