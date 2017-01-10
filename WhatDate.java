package test;

import java.util.*;
class WhatDate{
	public static void main(String[] args){
		int Total_Days=1,sw=0;
		int year, month,days;
 
		Scanner scan = new Scanner(System.in);
		System.out.println("input year");
		year = scan.nextInt();
		System.out.println("input month");
		month = scan.nextInt();
		System.out.println("input days");
		days = scan.nextInt(); //Step 2
		switch(month){
		case 1 :
			Total_Days+=0;
			break;
		case 2 :
			Total_Days+=31;
			break;
		case 3:
			Total_Days+=59;//31+28;
			break;
		case 4 :
			Total_Days+=90;//31+28+31;
			break;
		case 5 :
			Total_Days+=120;//31+28+31+30;
			break;
		case 6 :
			Total_Days+=151;//31+28+31+30+31;
			break;
		case 7 :
			Total_Days+=181;//31+28+31+30+31+30;
			break;
		case 8 :
			Total_Days+=212;//31+28+31+30+31+30+31;
			break;
		case 9 :
			Total_Days+=243;//31+28+31+30+31+30+31+31;
			break;
		case 10 :
			Total_Days+=273;//31+28+31+30+31+30+31+31+30;
			break;
		case 11 :
			Total_Days+=304;//31+28+31+30+31+30+31+31+30+31;
			break;
		case 12 :
			Total_Days+=334;//31+28+31+30+31+30+31+31+30+31+30;
			break;
		}
		Total_Days+=((year-1900)*365) +((year-1900)/4) + days;
		//Step 3,5
		if((year-1900)%4==0 && (month==1 || month==2))
			Total_Days-=1;
		//Step 4
		System.out.println(Total_Days);
		switch(Total_Days%7){
		case 0 : System.out.println
		(year+"/"+month+"/"+days+" = "+"Saturday");break;
		case 1 : System.out.println
		(year+"/"+month+"/"+days+" = "+"Sunday");break;
		case 2 : System.out.println
		(year+"/"+month+"/"+days+" = "+"Monday");break;
		case 3 : System.out.println
		(year+"/"+month+"/"+days+" = "+"Tuesday");break;
		case 4 : System.out.println
		(year+"/"+month+"/"+days+" = "+"Wednesday");break;
		case 5 : System.out.println
		(year+"/"+month+"/"+days+" = "+"Thursday");break;
		case 6 : System.out.println
		(year+"/"+month+"/"+days+" = "+"Friday");break;
		//Step 6
		}
	}
}
