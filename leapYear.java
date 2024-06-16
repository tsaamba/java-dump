import java.util.Scanner;

public class leapYear {
//ctrl +z is for backward
    //ctrl +d is for the copying to the next line the prev line
public static void main(String[]args){
    System.out.println("Enter a year");
    Scanner sc = new Scanner(System.in);
    long year = sc.nextLong();

    if(year%100!=0){
        if(year%4==0){
            System.out.println(year+ "is a leap year");
        }
        else{

            System.out.println(year+ "is not a leap year");
        }

    }
    else{
        if(year%400==0){
            System.out.println(year+ "is a leap year");
        }
        else{
            System.out.println(year+ "is not a leap year");
        }
    }

}

}
