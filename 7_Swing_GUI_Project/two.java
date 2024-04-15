/* _Coder   : anmamun0
   _Created : 15 April 2024 ||  16:00:00
   _File    : two.java */

import javax.swing.*;
import javax.swing.text.AbstractDocument.Content;
import java.awt.*;
public class two {
    public static void main(String[] args)
    {
    
        JFrame f = new JFrame();

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // f.setSize(400, 300);
        // f.setLocation(200, 300);
        f.setBounds(200, 300, 400, 500); //setLoaction, setSize altogather;
        f.setTitle("This is new Frame");
        f.setResizable(false);

        f.setLayout(null);
        
        //icon set
        // ImageIcon icon = new ImageIcon("no_image.png");
        // f.setIconImage(icon.getImage());

        f.getContentPane().setBackground(Color.yellow);
        

        Font fnt = new Font("Arial", Font.BOLD, 14);


        JLabel lb = new JLabel();
        lb.setText("Enter Your User Name : ");
        lb.setBounds(50, 20, 250, 50);
        lb.setFont(fnt);
        lb.setForeground(Color.red);

        lb.setBackground(Color.yellow);
        lb.setOpaque(true);

        lb.setToolTipText("this is a plaseHolder "); // plaseHolder
        String s = lb.getToolTipText();
        System.out.println(s);
        f.add(lb);

        JTextField usr = new JTextField();
        usr.setText("ANMamun");
        usr.setBounds(50, 80, 200, 30);
        f.add(usr);

        JLabel pass = new JLabel();
        pass.setText("Enter Your Password");
        pass.setBounds(50, 100, 150, 50);
        f.add(pass);


    }
}