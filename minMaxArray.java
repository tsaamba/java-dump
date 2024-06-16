import java.util.Scanner;
public class minMaxArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
       int n;
        System.out.println("Enter number of  elements in array");
        n = sc.nextInt();
        int [] num = new int[n];
        for (int i = 0;i<n;i++ ){
            num[i] = sc.nextInt();

        }
        // for finding minimum and max
        int min = num[0];
        int max = num[0];

        for (int i = 1;i<n;i++ ){
            //num[i] = sc.nextInt();
            if(min>num[i]){
                min = num[i];
            }
            if(max<num[i]){
                max = num[i];
            }

        }

        System.out.println("min is "+ min);
        System.out.println("max is "+ max);

    }
}
