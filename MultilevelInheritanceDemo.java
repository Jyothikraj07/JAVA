import java.io.*;
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can Bark");
    }
}
class Babydog extends Dog{
    void weep(){
        System.out.println("A Babydog can weep");
    }
}
public class MultilevelInheritanceDemo{
    public static void main(String args[]){
        Babydog bd = new Babydog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}