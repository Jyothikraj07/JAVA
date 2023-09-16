import java.io.*;
import java.util.*;
class Student {
    int rollno;
    String name;
    static String college="SITE"; //static value
static void change() {
    college = "SASI";    
}
Student(int r,String n){
    rollno = r;
    name = n;
}
void display(){
    System.out.println(rollno+" "+name+" "+college);
}
}
public class StaticMethordDemo{
    public static void main(String args[]){
        Student s1 = new Student(741,"SAI");
        Student.change();
        Student s2 = new Student(447,"RAVI");
        System.out.println("The Student details are : ");
        s1.display();
        s2.display();
    }
}