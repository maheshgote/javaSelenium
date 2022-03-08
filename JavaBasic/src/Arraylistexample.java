import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("a","b"));
		ArrayList<String> b = new ArrayList<String>(Arrays.asList("a","c"));
		a.retainAll(b);
		System.out.println(a);
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(43);
		marks.add(55);
		marks.add(87);
		marks.add(54);
		System.out.println(marks);
		marks.set(0,99);
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);
		Collections.sort(marks, Collections.reverseOrder());
		System.out.println(marks);
		
		for(int i=0; i<=marks.size()-1;i++) {
			System.out.println(marks.get(i));
		}
		
		
		
	

	}

}
