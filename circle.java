import java.util.Scanner;
public class circle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        double area = 22*rad*rad/7;
        double per = 22*2*rad/7;

        System.out.println(area);
        System.out.println(per);

    }
}
