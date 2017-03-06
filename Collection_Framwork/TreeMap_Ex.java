package test;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMap_Ex {
	public static void main(String args[]) {
		TreeMap<Integer, String>tmap = new TreeMap<Integer, String>();
		
		tmap.put(1, "number 1");
		tmap.put(3, "number 3");
		tmap.put(5, "number 5");
		tmap.put(2, "number 2");
		tmap.put(4, "number 4");
		
		NavigableSet<Integer> navi = tmap.navigableKeySet();
		//Map have not iterator interface.
		
		Iterator<Integer> itr = navi.iterator();
		while(itr.hasNext()){
			System.out.println(tmap.get(itr.next()));
		}
	}
}