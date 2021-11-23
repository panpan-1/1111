package ×÷Òµjava;
import java.util.Date;
public class UseTheDateClassDate9_3 {

	public static void main(String[] args) {
		  long K = 10000;
	        Date day = new Date(K);
	        System.out.println(K+":"+day.toString());
	        for(int i = 0;i < 7;++ i){
	            K *= 10;
	            day.setTime(K);
	            System.out.println(K+":"+day.toString());
	        }
	    }
	}
