package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList - default class
		
		ArrayList  ar = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		
		System.out.println(ar.get(0)); //Gives 100
		System.out.println(ar.get(3));
		
		ar.add(500);
		System.out.println(ar.get(4));
		ar.add(1, 1100);
		System.out.println(ar.get(1));
		ar.add(8, 1500);
		System.out.println(ar.get(8));
		
		ArrayList  pr = new ArrayList(20);
		
		
	}

}
