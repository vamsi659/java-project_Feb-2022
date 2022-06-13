package WraperClass;

public class DataConversion {

	private static final String Interger = null;

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);

		//String to int:
		int i = Integer.parseInt(x);
		System.out.println(i + 20);

//		String y = "100A";
//		int j = Integer.parseInt(y);
//		System.out.println(j + 20);
		
		//String to double:
		String t = "100";
		System.out.println(t + 20);
		
		double d = Double.parseDouble(t);
		System.out.println(d+20);
		
		//int to String
		int p = 100;
		System.out.println(p + 30);
		
		String s = String.valueOf(p);
		System.out.println(s+30);
		
		String remote = "true";
		if(Boolean.parseBoolean(remote)) {
			System.out.println("running test cases on grid");
		}
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
