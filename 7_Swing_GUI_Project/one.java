/* _Coder   : anmamun0
   _Created : 15 April 2024 ||  15:29:11
   _File    : one.java */
import javax.swing.*;
public class one {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name : ");

        ImageIcon icon = new ImageIcon("no-image.png");
        JOptionPane.showMessageDialog(null, name + " Welcome to swing", "Warning", JOptionPane.ERROR_MESSAGE, icon);

        
    }
}