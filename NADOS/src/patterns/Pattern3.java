package patterns;

import java.util.Scanner;

public class Pattern3 {
	
	 public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);

	        // take input
	        int n = scn.nextInt();
	        
	        // iterate n times
	        for(int i = 1; i <= n; i++){
	            //print (n-i) spaces first
	            for(int j = 1; j <= (n-i); j+=1){
	                System.out.print("\t");
	            }
	            
	            //print i starts next
	            for(int k = 1; k <= i; k++){
	                System.out.print("*\t");
	            }
	            
	            //go to next row
	            System.out.println();
	        }
	        

	    }

}
