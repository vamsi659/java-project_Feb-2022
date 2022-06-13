package javasessions;

public class ArrayConcept {

	private static Object Arrays;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// limitations of array:
		// 1. size is fixed: static array:
		// 2. Stores only similar data types

		// 1. int array:

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println("li = " + 0);
		int len = i.length;
		System.out.println("length =" + len);
		System.out.println("length =" + (len - 1));

		System.out.println(i[0]);
		System.out.println(i[3]);

		System.out.println(i[1] = i[2]);
		// print all the values from array: iterate the array: use loop:

		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);

		}
		System.out.println("----------------");
		// for each loop:

		for (int e : i) {
			System.out.println(e);

		}

		int counter = 0;
		for (int e : i) {
			System.out.println(counter + ":" + e);
			counter++;
		}

		// double array:
		double d[] = new double[3];
		d[0] = 12.43;
		d[1] = 23.44;

		for (double e : d) {
			System.out.println(e);
		}

		// char array

		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = '%';

		for (char e : c) {
			System.out.println(c);

		}

		// string array:
		String names[] = new String[3];
		names[0] = "Java";
		names[1] = "Python";
		names[2] = "Vamsi";
		//System.out.println(Arrays.toString(names));

		for (String k : names) {
			System.out.println(k);
			if (k.equals("Java")) {
				System.out.println("java is my fav prog lang..");
				break;
			}
		}

		int marks[] = new int[] {10,12,123,434,32};
		System.out.println(marks[3]);
		
		//8am IST
	}
}
