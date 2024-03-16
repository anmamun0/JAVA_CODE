//-------------------------- AN.MAMUN----------------------------
class hello{
    int x ;
    int y;
    float z;

    hello (int a, int b, float c){
        x = a;
        y = b;
        z = c;
    }
}

public class Chapter_7_Constructor_Method {
    public static void main(String[]args){
        hello mamun = new hello(10,30,9.5f);

        System.out.println (mamun.z);
    }
}