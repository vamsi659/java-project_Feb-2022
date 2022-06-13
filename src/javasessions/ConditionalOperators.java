package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		System.out.println(a > b);

		if (a > b) {
			System.out.println("a is gr than b");
		} else {
			System.out.println("b is gr than a");
		}
		if (true) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");// dead code is underlined by yellowline
		}
		boolean flag = true;
		if (flag) {
			System.out.println("Java");
		} else {
			System.out.println("Python");
		}
		//
		// ctrl+Sht+F will format the code
		//
		// nested if
		int marks = 97;
		if (marks <= 100) {
			if (marks >= 95) {
				System.out.println("A++ Grade");
			} else {
				if (marks <= 30) {
					System.out.println("Fail");
				} else {
					System.out.println("A Grade");

				}
			}
		} else {
			System.out.println("Wrong marks");
		}

		
		//float example
		float marks1 = 29.33f;
		if (marks1 <= 100.55) {
			if (marks1 >= 95.11) {
				System.out.println("A++ Grade");
			} else {
				if (marks1 <= 30.21) {
					System.out.println("Fail");
				} else {
					System.out.println("A Grade");

				}
			}
		} else {
			System.out.println("Wrong marks");
		}
		
		// if -if - if (No to be used as it is not optimised code)

//		String name = "Harsh";
//
//		if (name.equals("Harsh")) { // equals is used for compraision and find true or false
//			System.out.println("100 marks");
//		}
//		if (name.equals("Vicky")) {
//			System.out.println("90 marks");
//		}
//		if (name.equals("Ravi")) {
//			System.out.println("80 marks");
//		}
//		if (name.equals("Naveen")) {
//			System.out.println("10 marks");
//		} else {
//			System.out.println("student is not found...");
//		}

		// if - else if
		String name = "Tom";

		if (name.equals("Harsh")) { // equals is used for compraision and find true or false
			System.out.println("100 marks");
		} else if (name.equals("Vicky")) {
			System.out.println("90 marks");
		} else if (name.equals("Ravi")) {
			System.out.println("80 marks");
		} else if (name.equals("Naveen")) {
			System.out.println("10 marks");
		} else {
			System.out.println(name + " student is not found...");
		}

		// test evn
		// DEV, QA, UAT, PQA, STAGE, PROD

		String testenv = " DEV ";

		if (testenv.toLowerCase().trim().equals("dev")) {
			System.out.println("Dev Env");
		} else if (testenv.equals("qa")) {
			System.out.println("QA Env");
		} else if (testenv.equals("uat")) {
			System.out.println("UAT Env");
		} else if (testenv.equals("pqa")) {
			System.out.println("PQA Env");
		} else if (testenv.equals("stage")) {
			System.out.println("Stage Env");
		} else if (testenv.equals("prod")) {
			System.out.println("Prod Env");
		} else {
			System.out.println("Not applicable Env");
		}
	}
}
