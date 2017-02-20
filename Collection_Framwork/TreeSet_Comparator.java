package test;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class strCompare implements Comparator<String>
{
	public int compare(String p1, String p2){
		if(p1.length()>=p2.length())
			return 1;
		else 
			return -1;
	}
}
public class TreeSet_Comparator {
	public static void main(String args[]) {
			
			TreeSet<String> tr = new TreeSet<String>(new strCompare());
			tr.add("First");
			tr.add("Second");
			tr.add("zero");
			tr.add("Thirddddd");
			
			Iterator<String> it = tr.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
	}
}
