package javasessions;

public class StringConcatenation {
	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		double d1 =12.33;
		double d2 =32.33;
		
		String x="hello";
		String y="selenium";
		
		System.out.println(a+b);
		System.out.println(x+" "+y);
		System.out.println(a+b+" "+x+" "+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(x+y+d1+d2+a+b);
		
		System.out.println("the value of a" +a);
		System.out.println("the value of b" +b);
		System.out.println("the value of a+b" +(a+b));
		System.out.println('a'+'b'); //ASCii values will be added (98+97=195)
		
		byte p = 100;
		byte q = 100;	
		int z = (p+q);
		System.out.println(z);
		
		short s1 = 100;
		short s2 = 400;	
		int s3 = (s1+s2);
		System.out.println(s3);
		
	}

}
