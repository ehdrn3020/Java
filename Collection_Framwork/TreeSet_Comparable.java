package test;
import java.util.TreeSet;
import java.util.Iterator;

class Person implements Comparable<Person>
{
	String name;
	public Person(String name){
		this.name = name;
	}
	public int compareTo(Person p){
		if(this.name.length()>=p.name.length())
			return 1;
		else 
			return -1;
	}
	public String toString()
	{
		return this.name;
	}
}
public class TreeSet_Comparable {
	public static void main(String args[]) {
			
			TreeSet<Person> tr = new TreeSet<Person>();
			tr.add(new Person("First"));
			tr.add(new Person("Second"));
			tr.add(new Person("zero"));
			tr.add(new Person("Thirddddd"));
			
			Iterator<Person> it = tr.iterator();
			while(it.hasNext()){
				System.out.println(it.next().toString());
			}
	}
}
