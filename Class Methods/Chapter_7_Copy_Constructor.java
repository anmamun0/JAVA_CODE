//-------------------------- AN.MAMUN----------------------------
class Student{
    int roll;
    Student(int r) {
        roll = r;
    }
    Student(Student s){
        roll = s.roll;
    }
    void Display(){ 
        System.out.println("Roll is:  "+ roll);
    }
}
public class Chapter_7_Copy_Constructor{
    public static void main(String[] args) {

        Student s1 = new Student(101);

        s1.Display();
        System.out.println();
        Student s2 = new Student(s1);
        s2.Display();
        System.out.println("Both are same");
    }
}