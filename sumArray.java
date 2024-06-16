import java.util.Scanner;
public class sumArray {
    public static void main(String[] args){
        int num[] = {52,58,56,32,23,74,12,25};
        int sum  =0;
        for (int i =0;i<num.length;i++){
            sum += num[i];
        }
        System.out.println(sum);
    }
}
