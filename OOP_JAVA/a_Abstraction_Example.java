//Abstract class
abstract class Shap
{
    //Abstract method
    abstract void draw();
}

//Concrete subclass imnplemention abstract method
class Circle extends Shap
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shap
{
    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}

public class a_Abstraction_Example
{
    public static void main(String[] args) 
    {
        Shap sp1 = new Circle();
        Shap sp2 = new Rectangle();

        sp1.draw();
        sp2.draw();
   }
}

/*
output:

Drawing Circle
Drawing Rectangle
*/