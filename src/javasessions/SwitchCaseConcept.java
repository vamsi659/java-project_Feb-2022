package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Vicky";
		switch (name) {

		case "Harsh":
			System.out.println("100 marks");
			break;

		case "Ravi":
			System.out.println("90 marks");
			break;

		case "Naveen":
			System.out.println("80 marks");
			break;

		case "Vicky":
			System.out.println("10 marks");
			break;

		default:
			System.out.println("student is not found: " + name);
			break;
		}

		int marks = 90;// ctrl + space + select "switch case statement" for switch statement
		// Can only use with string and int values
		switch (marks) {
		case 90:
			System.out.println("Science");
			break;

		case 80:
			System.out.println("Maths");
			break;

		case 70:
			System.out.println("Comm");
			break;

		case 60:
			System.out.println("Arts");
			break;

		default:
			System.out.println("Failed");
			break;
		}

		// ".replace(" ", "")" to remove all the spaces in any string
		String browser = "CHROME ";
		switch (browser.toLowerCase().trim()) { // convert the string to lower case ".tolowercase() //".trim()" will
												// remove any spaces before or after the string
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("please pass the right browser  " + browser);
			break;
		}

		//
		// test evn
		// DEV, QA, UAT, PQA, STAGE, PROD
		// switch case
		// if else if

		String testenv = "dev";
		switch (testenv.toLowerCase().trim()) {
		case "dev":
			System.out.println(" It is Dev Env");
			break;
		case "qa":
			System.out.println(" It is QA Env");
			break;
		case "uat":
			System.out.println(" It is UAT Env");
			break;
		case "PQT":
			System.out.println(" It is PQT Env");
			break;
		case "stage":
			System.out.println(" It is Stage Env");
			break;
		case "Prod":
			System.out.println(" It is Prod Env");
			break;
		default:
			System.out.println("Not defined Env");
			break;
		}

		//
		// state (Key)
		// cases: KA, MH, Delhi,
		// total corona cases
		String state = "Delhi";
		switch (state.toLowerCase().trim()) {
		case "delhi":
			System.out.println("Corona cases in Delhi is 100k");
			break;
		case "ka":
			System.out.println("Corona cases in KA is 50k");
			break;
		case "mh":
			System.out.println("Corona cases in MH is 30k");
			break;
		default:
			System.out.println("Not applicable state");
			break;
		}

		// salary switch
		String emp = "Naveen";
		int salary = 0;

		switch (emp) {
		case "Naveen":
			salary = 20;
			break;

		case "Ravi":
			salary = 80;
			break;

		case "Sita":
			salary = 90;
			break;

		default:
			System.out.println("emp is not found");
			break;
		}

		System.out.println("emp : " + emp + " having salary :" + salary);
	}

}
