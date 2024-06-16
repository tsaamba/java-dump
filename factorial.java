import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial of which number?");
        int a = sc.nextInt();
        int fact =1;
        for(int i =1; i<a+1;i++){
            fact *= i;
        }
        System.out.println("Factorial of this number : " + fact);
    }

}
