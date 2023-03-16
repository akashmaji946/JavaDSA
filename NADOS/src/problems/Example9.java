package problems;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int sum = 0;
		
		int i = 1;
		while(n > 0) {
			int v = n % 10;
			sum += i * (int)Math.pow(10, v-1);
			i++;
			n/=10;
		}
		
        System.out.println(sum);
	}

}
