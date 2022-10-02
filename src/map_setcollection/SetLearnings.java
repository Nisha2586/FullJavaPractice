package map_setcollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLearnings {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("asd");
		s.add("aad");
		s.add("rhd");
		s.add("zxc");
		
//		for(Object o : s) {
//			System.out.println(o);
//		}
//		
//		Iterator it = s.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Set s1 = new LinkedHashSet(s);
		Iterator it1 = s1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		Set s3 = new TreeSet(s);
			for(Object o : s3) {
			System.out.println(o);
		}
	}

}
