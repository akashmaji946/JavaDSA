package problems;

import java.util.Scanner;

public class Example14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    
	    int i = 1;
	    while(i * i <= n){
	        System.out.printf("%d\n", i*i);
	        i++;
	    }
	    

	}

}
