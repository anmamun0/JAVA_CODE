//-------------------------- AN.MAMUN----------------------------
//              ID: 676229; DEP: Computer Science (B2);

import java.util.Scanner;

public class Chapter_4_1{
    public static void main(String[] args) {
        Scanner value  = new Scanner(System.in);

        System.out.println("Enter Fast Number");
        int a = value.nextInt();

        System.out.println("Enter Second Number");
        int b = value.nextInt();

        System.out.println("Enter 3rd Number");
        int c = value.nextInt();

        if(a>b && a>c){
            System.out.println("Fast Number is Higest: "+a);
        }
        else if(b>c){
            System.out.println("Second Number is Higest : "+b);
        }
        else{
            System.out.println("3rd Number is Higest: "+c);
        }

    }
}


     