import java.io.*;
class Animal{
    void eat(){
        System.out.println("An Animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("An Dog can Bark");
    }
}
public class SingleInheritanceDemo{
    public static void main(String args[]){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}