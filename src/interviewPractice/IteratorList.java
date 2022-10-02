package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.TreeSet;

public class IteratorList {

	public static void main(String[] args) {
	
		List<Integer> li = new ArrayList<Integer>();
		li.add(34);
		li.add(7);
		li.add(7);
		li.add(null);
		li.add(null);
		li.add(null);

		
		List li2 = new ArrayList();
		li2.add(1);
		li2.add(15);
		li2.add(10);
		// for each is a unidirectional loop,can't do remove operation.
		// iterator is unidirectional but we can remove objects.
		// ListIterator is bydirectional and we can remove,set,add value of objects.
		// All from cursors interface of java collections.
		
		
		li.remove(null);

		Iterator it = li.iterator();
		if (it.hasNext()) {
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
			if (it.next() == null)
				it.remove();
					}

		ListIterator lit = li2.listIterator();
		if (lit.hasNext()) {
			System.out.println("List Iterator :" + lit.next());
			System.out.println(lit.previous());
		}
		System.out.println(li2 +" : " +li);
	

	}

}
