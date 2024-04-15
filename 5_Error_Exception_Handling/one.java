/* _Coder   : anmamun0
   _Created : 14 April 2024 ||  02:08:21
   _File    : one.java */
import java.util.List;
import java.util.ArrayList;

public class one {
    public static void main(String[] args)
    {
    
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        try{
            System.out.println(list.get(3));
        }
        catch(Exception e)
        {
            System.out.println("Error;");
        }
        finally
        {
            System.out.println("It must will print");
        }

        
}
