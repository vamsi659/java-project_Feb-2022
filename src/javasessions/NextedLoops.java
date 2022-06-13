package javasessions;

public class NextedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j <= 9; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println(); // remove "ln" for print in the same in the print statement
		}
		
		System.out.println("-------------------");

		// 000 001 002
		// ............999
		// print the above
		for (int a = 0; a <= 9; a++)
			for (int b = 0; b <= 9; b++) {

				for (int c = 0; c <= 9; c++) {
					System.out.print(a + "" + b + "" + c + " ");
				}
				System.out.println(); // remove "ln" for print in the same in the print statement
			}

	}

}
