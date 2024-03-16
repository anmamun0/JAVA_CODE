//-------------------------- AN.MAMUN----------------------------
class over{
    int hello(int x, int y){
        int z = x+y;
        System.out.println("Using int mathod : "+z);           
        return 0;
    }
    float hello(float x, float y){
        float z = x+y;
        System.out.println("Using int mathod : "+z);
        return 0;
    }
    int hello(int x){
        System.out.println("Using 2nd int methon ");

        return 0;
    }
    
}
public class Chapter_7_Overloading_Method{
    public static void main(String[] args){
    
        over mamun = new over();
        mamun.hello(10,20);

        over asik = new over();
        asik.hello(10.5f,20.3f);
    }
}