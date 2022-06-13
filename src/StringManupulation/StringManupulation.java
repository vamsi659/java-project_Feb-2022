package StringManupulation;

import java.util.Arrays;

public class StringManupulation {

	public static void main(String[] args) {

		String s = "hello hi this is my java code";

		System.out.println(s.length());
		System.out.println("li :" + 0);
		System.out.println("hi:" + (s.length() - 1));

		System.out.println(s.charAt(4));
		System.out.println(s.charAt(22));
		System.out.println(s.charAt(s.length() - 1));
		System.out.println(s.charAt(0));
		// System.out.println(s.charAt(-1)); //SIOB
		// System.out.println(s.charAt(23)); //SIOB

		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf('i')); // 1st occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i') + 1)); // 2nd occurrence of i
		// System.out.println(s.indexOf('i', (s.indexOf('i') + 1) + 1)); // 3rd
		// occurrence of i

		System.out.println(s.indexOf("this"));
		System.out.println(s.indexOf("hello"));
		System.out.println(s.indexOf("Naveen"));

		String mesg = "Welcome admin";
		if (mesg.indexOf("admin") >= 0) {
			System.out.println("admin is present");
		} else {
			System.out.println("admin is not present");
		}

		// contains:
		String m = "welcome to app world";
		System.out.println(m.contains("welcome"));
		if (m.contains("app world")) {
			System.out.println("PASS");
		}

		// equals:
		// String literals -- String constant pool (SCP)
		String s1 = "welcome selenium";
		String s2 = "welcome selenium";
		String s4 = "welcome selenium";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String s3 = new String("welcome selenium"); // String Object
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3));// true
		String s5 = new String("JAVA");// 2 -- heep, scp
		String s6 = "JAVA";

		String n = new String("Python");
		String nn = "Python";
		String nnn = "python";
		String mm = new String("python");// heap 1

		String t1 = "hello";
		t1 = "hello java";
		System.out.println(t1);
		String t2 = t1;
		System.out.println(t2);

		String p1 = "Testing";
		p1 = p1 + "NAL";
		System.out.println(p1);
		p1 = "Testing";
		System.out.println(p1);

		// trim:

		String pop = "    hello selenium   ";
		System.out.println(pop.trim());

		// replace:
		String pol = " hello       testing    ";
		System.out.println(pol.replace(" ", ""));

		String dob = "01-01-1990"; // 01/01/1990
		System.out.println(dob.replace("-", "/"));

		// lower/upper cases:
		String low = "testing is my fav subject";
		System.out.println(low.toLowerCase());
		System.out.println(low.toUpperCase());

		// split:
		String lang = "Java_python_Ruby_DotNet";
		String lg[] = lang.split("_");
		System.out.println(lg[0]);

		System.out.println(Arrays.toString(lg));

		String loop = "xXtestingxXXSeleniumXXxXPythonxxXJava";
		String sg[] = loop.split("xX");
		System.out.println(sg[0]);
		System.out.println(sg[1]);
		System.out.println(sg[2]);
		System.out.println(sg[3]);
		System.out.println(sg[4]);
		
		for(String e : sg) {
			System.out.println(e);
		}

		System.out.println(Arrays.toString(sg));

		String loop1 = "xXtestingxXXSeleniumXXxXPythonxxXJava";
		String sg1[] = loop1.toLowerCase().split("x");
		System.out.println(sg1[0]);

		System.out.println(Arrays.toString(sg1));

		String loop2 = "xXtestingxXXSeleniumXXxXPythonxxXJava";
		String sg2 = loop2.replace("x", " ");
		String sg3 = sg2.replace("X", "");
		String sg4 = sg3.replace("  ", " ");
		//String sg4[] = sg3.toLowerCase().split("");
		System.out.println(sg3);
		System.out.println(sg4);
		
		//for(String e : sg4) {
			//System.out.println(e);
		}

		//System.out.println(Arrays.toString(sg4));
		
		
		
	}

//}
