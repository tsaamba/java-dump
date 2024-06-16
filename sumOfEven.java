import java.util.Scanner;
public class sumOfEven {
    public static void main(String[]args){

        System.out.println("enter the staring even digit from which you want the sum");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        System.out.println("enter the ending even digit till which you want the sum");
        int b = sc.nextInt();
        int sum =0;
// This below code will also work.
        /*for(int i =a/2; i<=b/2;i++){
           sum += 2*i;
        }  */

        for (int i =a ; i<=b;i+=2){

            sum +=i;
        }
        System.out.println("sum is " + sum);
    }

}
