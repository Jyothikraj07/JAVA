import java.io.*;
class Animal{
    void eat(){
        System.out.println("An Animal can Eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("A Dog can bark");
    }
}
class Cat extends Dog{
    void meow(){
        System.out.println("A Cat can say Meow!!");
    }
}
public class HeirarichalInheritanceDemo{
    public static void main(String args[]){
        Dog d = new Dog();
        Cat c = new Cat();
        d.bark();
        c.meow();
        d.eat();
    }
}