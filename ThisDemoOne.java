import java.io.*;
import java.util.*;
class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println("Student details are:");
        System.out.println(rollno+" "+name+" "+fee);
    }
}
public class ThisDemoOne{
    public static void main(String args[]){
        Student s1 = new Student(440,"Jyothik",18000);
        Student s2 = new Student(220,"Varun",14000);
        s1.display();
        s2.display();
    }
}
