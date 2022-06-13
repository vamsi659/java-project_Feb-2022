package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		System.out.println(i);
		// Big 0 -> 0(1) -- constant time

		for (int j = 0; j <= 10; j++) {
			System.out.println(j);

		}

		// 1+n+n+n ==> 3n+1 (linear equation)
		// 3n + 1 ==> 3n ==> 0(n)

		for (int m = 0; m <= 10; m++) {
			for (int n = 0; n <= 10; n++)
				System.out.println(m + n + "" + " ");
			{

			}

		}

		// (1+n+n)(1+n+n+n)
		// (1+2n)(1+3n) ==>

		for (int m = 0; m <= 10; m++) {
			for (int n = 0; n <= 10; n++) {
				for (int q = 0; q <= 10; q++) {
					System.out.println(m + n + q + "" + " ");
				}
				

			}

		}

		
		
	}

}
