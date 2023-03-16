package problems;

import java.util.Scanner;

public class Example10 {
	   public static void main(String[] args) {
	       
	       Scanner scn = new Scanner(System.in);
	       int n = scn.nextInt();
	       int k = scn.nextInt();
	       
	       int nod = 0;
	      
	       int temp = n;
	       while(temp > 0){
	           temp = temp /10;
	           nod++;
	       }
	       //Optimization
	       k = k % nod;
	         if (k < 0)
	            k += nod;
	         
	     //  System.out.println(nod);
	       int i = 1;
	       int sum=0;
	       while(i <= k){
	          int rem =  n%10;
	          sum = sum + rem * (int)Math.pow(10, i-1);
	          n = n/10;
	          i++;
	       }
	     //  System.out.println(sum);
	     //  System.out.println(n);
	       sum = sum * (int)Math.pow(10, nod-k) + n;
	       System.out.println(sum);
	     
	    }
	   
	   public static void test() {
		    Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int k = scn.nextInt();

		    int nod = 0;
		    int temp = n;
		    while (temp != 0) {
		      temp /= 10;
		      nod++;
		    }

		    k = k % nod;
		    if (k < 0)
		      k += nod;

		    int div = 1;
		    int mult = 1;
		    for (int i = 1; i <= nod; i++) {
		      if (i <= k)
		        div *= 10;
		      else
		        mult *= 10;
		    }

		    int quo = n / div;
		    int rem = n % div;

		    int r = rem * mult + quo;
		    System.out.println(r);
	   }

}
