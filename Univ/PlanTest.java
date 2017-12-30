//Design Plane Class Architect

package test;
import java.util.*;

class Plane{
	private String company;
	private String model;
	private int psg;
	public static int count=0;
	public Plane(String company,String model, int psg){
		this.company=company;
		this.model=model;
		this.psg=psg; 
		count++; //Count plane.
	}
 
	public Plane(String company,String model){
		this(company,model,0);
	}
	public Plane(String company){
		this(company,"\0",0);
	}
	public Plane(){
		this("\0","\0",0);
	} //Duplication Creation
	
	public String Getcom(){ return company; }
	public String Getmo(){ return model; }
	public int Getpsg(){ return psg; }
 
	public void Setcom(String scom){ company=scom; }
	public void Setmo(String smo){ model=smo; }
	public void Setpsg(int spsg){ psg=spsg; }
 
	public static int getPlanes(){ return count; }
}
 
public class PlanTest
{
	public static void main(String args[]){
		Plane p1=new Plane("Asisna","co-22",500);
		Plane p2=new Plane("Jeju","S1027");
		Plane p3=new Plane("k-12");
		Plane p4=new Plane();
		p1.Setpsg(400);
		
		System.out.println(p1.Getcom()+" "+p1.Getmo()+" "+p1.Getpsg());
		System.out.println(p2.Getcom()+" "+p2.Getmo()+" "+p2.Getpsg());
		System.out.println(p3.Getcom()+" "+p3.Getmo()+" "+p3.Getpsg());
		System.out.println(p4.Getcom()+" "+p4.Getmo()+" "+p4.Getpsg());
		System.out.println(Plane.count);
	}
}
