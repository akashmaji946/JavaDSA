package patterns;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);

        //take inputs
        int n = scn.nextInt();
        
        //iterate n times
        for(int i = 0; i < n; i++){
            //print spaces
            for(int j = 1; j <= i; j++){
                System.out.print("\t");
            }
            //print a star
            System.out.print("*\n");
        }
        
        

    }

}
