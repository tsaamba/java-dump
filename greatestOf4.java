import java.util.Scanner;
// using ternary operator
public class greatestOf4 {
    public static void main (String[]srgs){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float great3 = 0;
        float great4 = 0;
        float great2 = 0;

        great3 = (a>=b)? a:b;
        great4 = (c>=d)? c:d;
        great2 = (great3>=great4)? great3:great4;
        System.out.println(great2);
    }
}
