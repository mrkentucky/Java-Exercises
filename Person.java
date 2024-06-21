/*Asssignment 7 
Question 2
MKNMAI001
Part I
Maitele Makungo */
public class Person{
String name;
String gender;
int age;
public Person(String name,int age, String gender){
this.name=name;
this.age=age;
this.gender=gender;

}
public Person(Person pers){
this.name=pers.name;
this.age=pers.age;
this.gender=pers.gender;

}
public int getAge(){
return age;
}
public String getName(){
return name;

}

public String getGender(){
return gender;
}
 public void setName(String name){ 
      this.name = name;
   }
   public void setGender(String gender){ 
      this.gender = gender;
   }
   public void setAge(int age){ 
      this.age = age;
   }





}