package javasessions;

import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList(5); //default capacity 10 spaces is overridden by 5 spaces
		System.out.println(ar.size());		
				
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		
		//lowest index (li) =0
		//highest index (hi) = size() - 1
		
		System.out.println("li =" + 0);
		System.out.println("length =" + ar.size());
		System.out.println("hi = "+ (ar.size()-1));
		
		ar.add(600);
		System.out.println("length =" + ar.size());
		
		ar.add(700);
		System.out.println("length =" + ar.size());
		
		ar.add(800);
		System.out.println("length =" + ar.size());
		
		System.out.println("-------------");
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			}
		
		System.out.println("-------------");
		
		ArrayList<Integer> markslist = new ArrayList<Integer>();//Add only Integer values as we have define it.
		markslist.add(100);
		markslist.add(2100);
		markslist.add(3010);
		System.out.println(markslist.size());		
		
		for (int j = 0; j < markslist.size(); j++) {
			System.out.println(markslist.get(j));
		}
		
		System.out.println(markslist);
		System.out.println("-------------");
		
		for(Integer e : markslist) {
			System.out.println(e);
		}
		
		//
		
		ArrayList<Double> bmList = new ArrayList<Double>(); //pc =0, vc=10
		
		//
		ArrayList<String> productList = new ArrayList<String>();
		productList.add("macbook pro");
		productList.add("mac");
		productList.add("pro");
		productList.add("iphone");
		
		System.out.println(productList.size());
		
		for(String f : productList) {
			System.out.println(f);
		}
		
		//emp info:
		ArrayList<Object> empInfo = new ArrayList<Object>();
		empInfo.add("Vani");
		empInfo.add(25);
		empInfo.add("f");
		empInfo.add(34.55);
		empInfo.add(true);
		
		System.out.println(empInfo);
		
		System.out.println("-------------");
		
		for (int k = 0; k < empInfo.size(); k++) {
			System.out.println(empInfo.get(k));
			if(empInfo.get(k).equals(true)) {
				System.out.println("Move to US");
			}
		}
		
		System.out.println("-------------");
		
		for(Object g : empInfo) {
			System.out.println(g);
		}
		
		
		
	}

}
