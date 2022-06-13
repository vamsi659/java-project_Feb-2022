package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print 1 to 10: using Loop
		// while loop:

		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			++a;
			// a++;
			// a = a + 1;
		}
		System.out.println("_______________________________");

		int p = 1;
		while (p <= 100) {
			System.out.println(p);
			if (p % 5 == 0) {
				System.out.println("Hi");
				break;
			}
			p++;
		}

		System.out.println("_______________________________");

		boolean flag = false;
		while (!flag) { // "!" will it change false to true
			System.out.println("welcome to Hotel");
			break;
		}

		System.out.println("_______________________________");

		// Examples of while loop: Whenever we are not sure about number of iterations
		// 1. Lazy loading : LinkedIn, Swiggy, FB
		// 2. Pagination: 1 2 3 4 5 ...20..80....100
		// 3. page loading: 10, 20, 40, 100
		// 4. element is getting displayed on the page: 10, 20, 40
		// 5. Carousel: website with ">" symbol to see the objects
		// 6. Calender:

		// FOR loop:
		// print 1 to 10

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("_EVEN______________________________");

		// print even numbers till 10 //Print even till 10 using % operator (even %
		// 2==0)
		for (int even = 0; even <= 10; even = even + 2)
			System.out.println(even);

		System.out.println("_EVEN______________________________");

		for (int even1 = 0; even1 <= 10;) {
			if (even1 % 2 == 0) {
				System.out.println(even1);
			}
			even1++;
			// System.out.println("Hi");

		}

		System.out.println("__ODD_____________________________");

		// print odd numbers till 10 (1 3 5 7 9)
		for (int odd = 1; odd < 10; odd = odd + 1) {
			System.out.println(odd);
			odd++;
		}

		System.out.println("_______________________________");

		// Boolean
		for (; true;) {
			System.out.println("bye..");
			break;
		}

		System.out.println("_______________________________");

		for (;;) {
			System.out.println("bye..");
			break;
		}

		System.out.println("_______________________________");

		// print from a to z with ASCii values using for loop
		for (char c = 'a'; c <= 'z'; c++)
			System.out.println(c + ":" + (int) c);

		// use cases:
		// drop down -- 10 values ;
		// total links: 100 - text of each link
		// suggestion list: google search, amazon search

		// do-while loop
		// print 1 to 10:

		int k = 1;
		do {
			k++;
			System.out.println(k);// prints 234567891011

		} while (k <= 10);

		// user cases:
		// 1. if element is immediately present on the page or not
		// 2.

	}

}
