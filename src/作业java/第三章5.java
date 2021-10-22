package 作业java;
import java.util.Random;
import java.util.Scanner;
public class 第三章5 {

	public static void main(String[] args) {
		
	        System.out.print("Please give money: ");
	        Random r = new Random();
	        Scanner input=new Scanner(System.in);
	        int x=100+r.nextInt(899);
	        int a=x/100;
	        int c=x%10;
	        int b=(x-c-a*100)/10;
	        int y=input.nextInt();
	        int q=y%10;
	        int o=y/100;
	        int p=(y-q-100*o)/10;
	        if(y==x){
	            System.out.println("Your are winning 10000$");
	        }else{
	            if((a==o&&b==q&&c==p)||(a==p&&b==o&&c==q)||(a==p&&b==q&&c==o)||(a==q&&b==o&&c==p)||(a==q&&b==p&&c==o)){
	                System.out.println("Your are winning 3000$");
	            }else{
	                if((a==o)||(a==p)||(a==q)||(b==o)||(b==p)||(b==q)||(c==o)||(c==p)||(c==q)){
	                    System.out.println("Your are winning 1000$");
	                }else{
	                    System.out.println("Your are winning 0$");
	                }
	            }
	        }
	    }


	}


