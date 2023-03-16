package problems;

import java.util.Scanner;

public class Example6 {
	  public static void main(String[] args) {
		     Scanner scn = new Scanner(System.in);
		     int n = scn.nextInt();
		     int c = 0;
		     while(n > 0){
		       n /= 10;
		       c++;
		     }
		    System.out.println(c);

		   }

}
