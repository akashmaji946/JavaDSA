package problems;

import java.util.Scanner;

public class Example5 {
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int x=0,y=1;
	      if(n==1){
	          System.out.println(x);
	      }
	      else if(n==2){
	          System.out.println(x);
	          System.out.println(y);
	      }
	      else{
	          int z;
	          System.out.println(x);
	          System.out.println(y);
	          for(int i=3; i<=n; i++){
	             z = x+y;
	             System.out.println(z);
	             x=y;
	             y=z;
	          }
	      }
	   }
	  
	  // another logic
	  public static void test(int n) {
		  int x=0, y=1, z;
		  for(int i = 1; i <= n; i++) {
		  	System.out.println(x);
		  	z = x + y;
		  	x = y;
		  	y = z;
		  }
	  }

}







