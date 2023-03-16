package problems;

import java.util.Scanner;

public class Example12 {
  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int div = 2;
	    
	    while(div <= n){
	        while(n % div == 0){
	            n = n/div;
	            System.out.print(div + " ");
	        }
	        div++;
	    }

  }
  
  public static void optimized() {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int div = 2;
	    
	   
	    while(div * div <= n){
	        while(n % div == 0){
	            n = n/div;
	            System.out.print(div + " ");
	        }
	        div++;
	    }
	    
	    // edge case: 23, 46, 17, all primes......
	    if(n != 1){
	        System.out.print(n + " ");
	    }
  }

}
