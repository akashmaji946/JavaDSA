package patterns;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // take inputs
        int n = scn.nextInt();
        
        int m = (n+1)/2;
        
        for(int i = 1; i <= m; i++){
            //print (m-i) spaces
            for(int j = 1; j  <= (m-i); j++){
                System.out.print("\t");
            }
            //print (2i-1) stars
             for(int j = 1; j  <= (2*i-1); j++){
                System.out.print("*\t");
            }
            //next line
            System.out.println();
            
        }
        
        m = n/2;
        int k=1;
        for(int i = m; i >= 1; i--){
            
            for(int j = 1; j <= k; j++){
                 System.out.print("\t");
            }
            k++;
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

}
