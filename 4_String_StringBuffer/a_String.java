/* _Coder   : anmamun0
   _Created : 14 April 2024 ||  01:14:35
   _File    : one.java */

public class a_String {
    public static void main(String[] args) {

        // char c = 'a';
        // System.out.println(c);

        // for (int i = 97; i < 105; i++)
        // System.out.println(i + '\n');

        // String s = "Hello_Word";
        // char[] arr = { 'a', 'b', 'c', 'd', 'e' };
        // int[] val = { 1, 2, 3, 4, 5 };
        // byte[] byt = { 'a', 'e', 'i', 'o', 'u' };
        // String other = new String(s);
        // String alfa = new String(arr);
        // String of = new String(arr, 0, 3);
        // System.out.println(of); // abc
        // System.out.println(s + " "+ alfa + " " +val + " "+ byt + " " + other );

        String s = "Hello_World", w = " My Name is AN.Mamun";
        char c = s.charAt(2); // l

        boolean chack = w.equals(s);
        System.out.println((chack) ? "YES" : "NO");

        String toup = s.toUpperCase(); // HELLO_WORLD
        String tolow = s.toLowerCase(); // hellow_world
        String sub = s.substring(0, 5); // Hello
        String rep = s.replace('l', 'M'); // HeMMo_word
        String trm = w.trim(); // My Name is AN.Mamun
        boolean emt = s.isEmpty();
        int ln = s.length(); // 11

        String tr = "Hay How are you my dear";
        String[] splt = tr.split(" "); // Hay How are you my dear
        // for (String d : splt) System.out.println(d);

        char[] mkChar = s.toCharArray();
        // System.out.println((s.startsWith("Hello"))?"True":"False"); // True

        String x = s.substring(5); // _Word

        int y = 44;
        String value = String.valueOf(y); // 44
        System.out.println(value);

    }
}