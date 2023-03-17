package patterns;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // take inputs
        int n = scn.nextInt();
        for(int i = n-1; i >= 0;  i--){
            for(int j = i; j >= 1; j--){
                System.out.print("\t");
            }
            System.out.println("*");
            
        }

    }

}
