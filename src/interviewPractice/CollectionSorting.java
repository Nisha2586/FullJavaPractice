package interviewPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		
		List<Integer> gvn = new ArrayList<Integer>();
			//{1,3,5,7,9,11,15,17,19};
		gvn.add(1);
		gvn.add(3);
		gvn.add(5);
		gvn.add(7);
		gvn.add(9);
		gvn.add(11);
		gvn.add(15);
		gvn.add(17);
		gvn.add(19);
		
		Collections.reverse(gvn.subList(0, 3));
		Collections.reverse(gvn.subList(3, 6));
		Collections.reverse(gvn.subList(6,9));
		System.out.println(gvn);//[5, 3, 1, 11, 9, 7, 19, 17, 15]
	

	}

}
