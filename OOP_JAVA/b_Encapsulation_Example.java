class Person
{
    private String name;
    private int age;

    //Getter method for name
    public String print_Name()
    {
        return name;
    }
    //Setter method for name 
    public void setName(String name)
    {
        this.name = name;
    }

    //Greter method for name
    public int print_age()
    {
        return age;
    }
    //Setter method for age
    public void setAge(int age)
    {
        this.age = age;
    }
}


public class b_Encapsulation_Example
{
    public static void main(String[] args) 
    {
        Person par = new Person();

        par.setName("AN.Mamun");
        par.setAge(20);

        System.out.println(par.print_Name());
        System.out.println(par.print_age());

    }
}

/*
output:

AN.Mamun
20
 */