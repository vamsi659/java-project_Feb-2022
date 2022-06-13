package javasessions;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> markslist = new ArrayList<Integer>();

		markslist.add(100);
		markslist.add(200);
		markslist.add(300);
		markslist.add(400);
		markslist.add(500);

//		System.out.println(markslist.size());
//
//		System.out.println(markslist.get(3));
//
//		markslist.remove(3);
//
//		System.out.println(markslist.get(3));
//
		markslist.remove(100);

		System.out.println(markslist.get(0));

	}

}
