/*Asssignment 7 
Question 2
MKNMAI001
part I
Maitele Makungo */
public class  Student extends Person{
String nameOfInstitution;
String programOfStudy;
int yearOfStudy;
String hobbies;


public Student(String name,int age, String gender,String nameOfInstitution,String programOfStudy,int yearOfStudy,String hobbies){
super(name,age,gender);
this.nameOfInstitution=nameOfInstitution;
this.programOfStudy=programOfStudy;
this.yearOfStudy=yearOfStudy;
this.hobbies=hobbies;
}
public Student(Student smo){
super(smo.name,smo.age,smo.gender);
this.nameOfInstitution=smo.nameOfInstitution;
this.programOfStudy=smo.programOfStudy;
this.yearOfStudy=smo.yearOfStudy;
this.hobbies=smo.hobbies;

}
public String getNameOfInstitution(){ //access the  name
      return this.nameOfInstitution;
   }
   public String getProgramOfStudy(){ //accesses the  age
      return this.programOfStudy;
   }
   public int getYearOfStudy(){//accesses the gender
      return this.yearOfStudy;
   }
   public String getHobbies(){//accesses the  hobbies.
      return this.hobbies;
   }

   public void setNameOfInstitution(String nameOfInstitution){ // set the name of the nameOfInstitutiontution of the student.
      this.nameOfInstitution = nameOfInstitution;
   }
   public void setProgramOfStudy(String programOfStudy){ // set the programm of study of the student.
      this.programOfStudy = programOfStudy;
   }
   public void setYearOfStudy(int yearOfStudy){ // set the study yearOfStudy of the student.
      this.yearOfStudy = yearOfStudy;
   }
   public void setHobbies(String hobbies){ // set the hobbie of the student.
      this.hobbies = hobbies;
   }






}