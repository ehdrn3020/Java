package test;

import java.util.*;

public class Press { 
	public static void main(String args[]){
	 int f,w;
	 double press;
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Enter the size of the force and the width of the object.");
	 f = input.nextInt();
	 w = input.nextInt();
	 
	 press=(double)f/w;
	 System.out.println("The strength of the pressure is "+press);
	 
	 input.close();
	}
}
