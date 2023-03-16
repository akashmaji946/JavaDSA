package problems;

import java.util.Scanner;

public class Example11 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int a = gcd(x,y);
        int b = lcm(x,y, a);
        System.out.println(a);
        System.out.println(b);
        
       }
       public static int gcd(int x, int y){
          if(x==0) return y;
          else if(y ==0) return x;
          
          if(x<y){
              return gcd(x, y%x);
          }else{
              return gcd(y, x%y);
          }
          
           
       }
       public static int lcm(int x, int y, int a){
          int b = x/a * y;
          return b;
           
       }

}
