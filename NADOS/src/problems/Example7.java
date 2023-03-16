package problems;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      
	      // call way1 or way2
	      test2(n);
	      
	     }

	     // way 1
		public static void test(int k){
	            if(k==0) 
	                return;
	            test(k/10);
	            System.out.println(k%10);
	     }
	     
		 // way2
	     public static void test2(int n){
	            int nod = 0;
	            int temp = n;
	            while(n > 0) {
	            	n = n/10;
	            	nod++;
	            }
	            int div = (int)Math.pow(10, nod-1);
	            while(div > 0) {
	            	int quo = temp / div;
	            	System.out.println(quo);
	            	
	            	//int rem = temp % div;
	            	temp = temp % div;
	            	div = div / 10;
	            }
	     }
	     
	     

}
