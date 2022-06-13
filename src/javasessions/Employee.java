package javasessions;

public class Employee {

	//Blueprint/Template/Category of the Objects
	
	String name;
	int age;
	String city;
	double salary;
	boolean isActive;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 =  new Employee();
		e1.name = "Tom";
		e1.age = 20;
		e1.city = "LA";
		e1.salary = 12.33;
		
		System.out.println(e1.name + " "+ e1.age + " " + e1.city + " " + e1.salary);
		
		Employee e2 = new Employee();
		e2.name = "Deepa";
		e2.age = 30;
		e2.city = "CA";
		e2.salary = 15543.33;
		
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.city);
		System.out.println(e2.salary);
		
		Employee e3 = new Employee();
		System.out.println(e3.isActive);
		
		Employee e4 = new Employee();
		e4 = null;//null reference object
		// e4.name = "Lisa";//NPE  Null point expection
		// System.out.println(e4.name);
		
		new Employee(); //no reference object
		
		
	}

}
