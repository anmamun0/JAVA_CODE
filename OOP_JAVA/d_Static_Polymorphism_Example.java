//Base class
class Animal 
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}
//Derived class 1
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog Sound...");
    }
}
//Derived class 2
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat Sound...");
    }
}

public class d_Static_Polymorphism_Example{
    public static void main(String[] args) 
    {
        Animal ani = new Dog() // Polymorphism
        Animal ani2 = new Cat() // Polymorphism

        ani.sound() // Dog Sound...
        ani2.sound() // Cat Sound...
  }
}