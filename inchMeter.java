import java.util.Scanner;

public class inchMeter {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length in inches");
        float a = sc.nextFloat();
        double b = a*0.0254;
        System.out.println("length in metre is : "+ b);
    }
}
