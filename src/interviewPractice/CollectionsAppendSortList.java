package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class CollectionsAppendSortList {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(34);
		li.add(7);
		li.add(77);
		li.add(7);
		li.add(null);
		li.add(null);
		li.add(null);

		
		List li2 = new ArrayList();
		li2.add(1);
		li2.add(15);
		li2.add(10);
		
//		Collections.replaceAll(li, null, 1);
		//li.remove(null);
		
		li.addAll(li2);
		//li.addAll(4, li2);
		System.out.println(li);
		
		li.removeIf(Objects::isNull);
		System.out.println(li);
		
		Collections.sort(li);
		System.out.println(li);
			
		System.out.println();
		
		TreeSet tr = new TreeSet(li);//sorting without duplicates
		System.out.print(tr);
			}

}
