package grammer;

import java.util.*;

class Business implements Cloneable{
	private String company;
	private String work;
	
	public Business(String com, String work){
		this.company = com;
		this.work = work;
	}
	public void showBusiness(){
		System.out.println("Company is : "+company);
		System.out.println("Work is : "+work);
	}
	public void changWork(String work){
		this.work = work;
	}
	public Object clone() throws CloneNotSupportedException{
		Business copy = (Business)super.clone();
		return copy;
	}
}

class PersonalInfo implements Cloneable{
	private String name;
	private int age;
	private Business bness;
	
	public PersonalInfo(String name, int age, String com, String work){
		this.name = name;
		this.age = age;
		bness = new Business(com,work);
	}
	public void showPer(){
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		bness.showBusiness();
		System.out.println("\n");
	}
	public void changWork(String work){
		bness.changWork(work); 
	}
	public void changName(String name){
		this.name = name; 
	}
	public Object clone() throws CloneNotSupportedException{
		PersonalInfo copy = (PersonalInfo) super.clone();
		copy.bness = (Business)bness.clone();
		return copy;
	}
}
class cloneOverriding {
	public static void main(String args[]) {
		try{
		
			PersonalInfo pInfo = new PersonalInfo("James",29,"Samsumg","IT");
			PersonalInfo pcopy = (PersonalInfo)pInfo.clone();
			
			pcopy.changWork("programming");
			pcopy.changName("Ann");
			pInfo.showPer();
			pcopy.showPer();
		
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}