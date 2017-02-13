package grammer;

import java.util.Random;
import java.util.Scanner;

class Random_function {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt(); //A>B
		int ranval;
		Random ran = new Random();
		
		for(int i=0;i<10;i++){
			ranval = ran.nextInt(A-B+1);
			ranval += B;
			System.out.println(ranval);  //random number of A to B
		}
	}
}
