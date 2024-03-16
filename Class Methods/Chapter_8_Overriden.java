class SuperClass
{
    int n;
    SuperClass()
    {
        n++;
    }
    public void GetDate()
    {
        System.out.println("It is supper class");
        System.out.println("n = :" + n);
    }
}
class subclass extends SuperClass
{
    int n;
    subclass()
    {
        n++;
    }
    public void GetDate()
    {
        System.out.println("It is Sub Class");
        System.out.println("n = :" + n);

    }
}

public class Chapter_8_Overriden
{
    public static void main(String[] args)
    {
        SuperClass sp = new SuperClass();
        sp.GetDate();
        
        subclass sb = new subclass();
        sb.GetDate();
    }
}

/* 
output: 
    It is supper class
    n = :1
    It is Sub Class
    n = :1

*/