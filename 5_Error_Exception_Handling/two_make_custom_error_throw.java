/* _Coder   : anmamun0
   _Created : 14 April 2024 ||  02:29:26
   _File    : two_make_custom_error_throw.java */
class custom extends Exception {
    public custom(String message) {
        super(message);
    }
}

public class two_make_custom_error_throw {
    public static void main(String[] args) {

        try {
            for (int i = 1; i <= 7; i++) {
                if (i == 4)
                    throw new custom("Encryption value 7");

                System.out.println(i);
            }
        } 
        catch (custom e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}