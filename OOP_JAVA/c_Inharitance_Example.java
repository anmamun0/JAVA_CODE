//Parent Class
class Animal
{
    void eat()
    {
        System.out.println("Animatl is eating...");
    }
}
// class Dog extends Animal{
//     void eat() { super.eat(); } 
//}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is Barking");
    }
}
public class c_Inharitance_Example
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();

        d.eat(); //Animatl is eating...
        d.bark(); //Dog is Barking
  }
}