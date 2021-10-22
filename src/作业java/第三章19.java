package 作业java;
import java.util.Scanner;
public class 第三章19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("The circumference of triangle is "+(a+b+c)+".");
        }else{
            System.out.println("There is no such triangle!");
        }

    }
}

