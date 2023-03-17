package patterns;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //take inputs
        int n = scn.nextInt();
        
        //iterate n times
        for(int i = 0; i < n; i++){
            
            //print space i times
            for(int j = 0; j < i; j++){
                System.out.print("\t");
            }
            
            //print star (n-i) times
            for(int j = 0; j < (n-i); j++){
                 System.out.print("*\t");
            }
            
            //go to next row
            System.out.println();
            
        }
        

    }

}
