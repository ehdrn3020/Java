package test;

import java.util.*;
import java.math.*;
class Person
{
	String name;
	int age;
	public Person(String name, int age){
		this.name =name;
		this.age = age;
	}
	public String toString(){
		return name+":  "+age;
	}
	public int hashCode(){
		return name.hashCode()+(age/10);
	}
	public boolean equals(Object ob){      //remove duplication
		Person t = (Person)ob;
		if((t.name == this.name) && (t.age == this.age)){
			return true;
		}
		else
			return false;
	}	
}
public class hashSet_example {
	public static void main(String args[]) {
		
		HashSet<Person> hash = new HashSet<Person>();
		hash.add(new Person("kim",26));
		hash.add(new Person("kang",29));
		hash.add(new Person("kim",26));
		hash.add(new Person("lee",21));
		hash.add(new Person("lee",31));
		
		System.out.println(hash.size());    //4
		Iterator<Person> it = hash.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
