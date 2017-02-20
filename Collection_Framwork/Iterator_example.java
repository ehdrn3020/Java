package test;

import java.util.*;

public class Iterator_example {
	public static void main(String args[]) {
			
			ArrayList<String> list = new ArrayList<String>();
			list.add("First");
			list.add("Second");
			list.add("Third");
			
			Iterator<String> it = list.iterator(); //list.descendingIterator() -> descending order
			while(it.hasNext()){
				String str = it.next();
				System.out.println(str);
				if(str.compareTo("Third")==0){
					it.remove();    //remove list["Thrid"]
				}
			}
			it = list.iterator();
			
			while(it.hasNext()){
				System.out.println(it.next());
			}		
	}
}
