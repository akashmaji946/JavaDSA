package patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        // Take n as input
        
        int n = scn.nextInt();
        
        //Let us go down from n to 1
        
        for(int i = n; i >= 1; i--){
            
            //Each time print i times * per row
            
            for(int j = 1; j <= i; j++){
                
                System.out.print("*\t");
                
            }
            
            System.out.println();
            
        }

       //EOP

    }

}
