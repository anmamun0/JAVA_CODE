//-------------------------- AN.MAMUN----------------------------
//              ID: 676229; DEP: Computer Science (B2);

import java.util.Scanner;

public class Chapter_4_2{
    public static void main(String[] args) {
        Scanner value  = new Scanner(System.in);

        System.out.println("Enter Fast Number");
        double a = value.nextDouble();

        System.out.println("Enter Second Number");
        double b = value.nextDouble();

        System.out.println("Enter 3rd Number");
        double c = value.nextDouble();

        double k = (b*b)-(4*a*c);

        if(k>0){
            double m1 = (-b+Math.sqrt(k));
            double m2 = (-b-Math.sqrt(k));
            System.out.println("Output:\nFast Ans:"+ m1 +"\n"+"Second Ans:" + m2); 
        }
        else if(k<0){
            System.out.println("Output:\nFix Complex Number");
        }
        else{
            double m1 = -b/(2*a);
            System.out.println("Output:\n Ans :"+m1);
        }
    }
}

     