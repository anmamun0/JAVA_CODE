class Calculator
{
    int add(int a, int b)
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
}
public class d_Daynamic_Polymorphism_Example
{
    public static void main(String[] args) 
    {
        Calculator cal = new Calculator();

        int sum = cal.add(5,3);
        int sum2 = cal.add(2.5, 7.5);

        System.out.println("sum is int" + sum);
        System.out.println("sum is double" + sum2);

  }
}