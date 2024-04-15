/* _Coder   : anmamun0
   _Created : 14 April 2024 ||  01:56:07
   _File    : adf.java */

public class b_StingBuffer_Builder{
    public static void main(String[] args)
    {
    
        StringBuffer sb = new StringBuffer("Hello"); //
        String s = "Hello_World",w = "anmamun0";

        StringBuilder a = new StringBuilder(s); // Hello_World;
        a.append('z'); // Hellow_Worldz;
        a.append(sb); // Hello_worldaHellow
        
        a.insert(0, 'A'); // AHello_WorldzHello;
        a.insert(0, w);// anmamun0AHello_worldzHello;
        a.delete(0, 7); // 0AHello_WorldzHello;
        a.replace(0, 2, "_"); // _Hello_WorldzHello;

        StringBuilder lst = new StringBuilder(10);
        
        System.out.println(a);     

    }
}