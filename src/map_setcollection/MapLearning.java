package map_setcollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLearning {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("Krish", 100);
		m.put("Adhvik", 200);
		m.put("Sri", 300);

		System.out.println(m);
		
		Set s=m.keySet();
		Collection c = m.values();
		Set es = m.entrySet();
		
		System.out.println(s);
		System.out.println(c);
		System.out.println(es);
//		for(Set se : m.entrySet()) {
//			System.out.println(se);
//		}
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
		Iterator it1 = es.iterator();
		while(it1.hasNext()) {
		Map.Entry me = (Map.Entry) it1.next();
		System.out.print( me.getKey());
		if(me.getKey().equals("Adhvik"))
		me.setValue(400);
		System.out.println( me.getValue());
		
		}
		
	}

}
