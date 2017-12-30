//A program that converts the hexadecimal string to a binary string.

package test;
import java.util.*;

public class Hexa_to_Bin{
	public static void main(String args[]){
		String [] hexa={"0000","0001","0010","0011", 
						"0100","0101","0110","0111",
						"1000","1001","1010","1011",
						"1100","1101","1110","1111"};
		String bin;
		System.out.println("Enter hexadecimal string : ");
		bin=new Scanner(System.in).next();
		System.out.println("Binary is ");
		for(int i=0;i<bin.length();i++){
			switch(bin.charAt(i)){
			case '0' : System.out.println(hexa[0]); break;
			case '1' : System.out.println(hexa[1]); break;
			case '2' : System.out.println(hexa[2]); break;
			case '3' : System.out.println(hexa[3]); break;
			case '4' : System.out.println(hexa[4]); break;
			case '5' : System.out.println(hexa[5]); break;
			case '6' : System.out.println(hexa[6]); break;
			case '7' : System.out.println(hexa[7]); break;
			case '8' : System.out.println(hexa[8]); break;
			case '9' : System.out.println(hexa[9]); break;
			case 'a' :System.out.println(hexa[10]); break;
			case 'b' :System.out.println(hexa[11]); break;
			case 'c' :System.out.println(hexa[12]); break;
			case 'd' :System.out.println(hexa[13]); break;
			case 'e' :System.out.println(hexa[14]); break;
			case 'f' :System.out.println(hexa[15]); break;
			default : System.out.println("wrong value");
			}
		}
	}
}
