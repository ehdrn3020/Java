package test;

import java.util.*;
import java.math.*;
public class Iterator_Test {
	public static void main(String args[]) {
		
		HashSet<String> hash = new HashSet<String>();
		hash.add("First");
		hash.add("Second");
		hash.add("Third");
		
		Iterator<String> it = hash.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
			if(str.compareTo("Third")==0){
				it.remove();    //remove hash["Thrid"]
			}
		}
		it = hash.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
