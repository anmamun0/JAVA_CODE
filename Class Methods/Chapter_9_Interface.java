interface Student
{
    static final int Roll = 344;
    static final String Name = "Mamun";
    void Display();
}
class Result implements Student{
    public float Mark;
    public void Display(){
        System.out.println("Roll is :"+ Roll);
        System.out.println("Name is : "+ Name);
    }
    public void GetMark(){
        Mark = 54.8f;
    }
    public void ShowMark(){
        System.out.println("Mark is : "+ Mark);
    }

}
public class Chapter_9_Interface{
    public static void main(String[] args) {
     Result R = new Result();
     R.Display();
     R.GetMark();
     R.ShowMark();

  }
}

/*
Output:
    Roll is :344
    Name is : Mamun
    Mark is : 54.8
 */