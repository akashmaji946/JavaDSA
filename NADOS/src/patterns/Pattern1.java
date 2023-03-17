/**
 * Pattern1.java created by akash on Mar 17, 2023
 */
package patterns;

import java.util.Scanner;

public class Pattern1 {
	
	// launching point
	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        // go n times
        for(int i = 1; i <= n; i++){
            //go i times for each loop
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            
            System.out.println();
        }
        //EOP

    }

}
