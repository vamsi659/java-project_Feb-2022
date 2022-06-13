package FinalizeConcept;

public class Employee {
	int age = 20;

	@Override
	public void finalize() {
		System.out.println("employee -- finalize method");

	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e = null;
		// System.out.println(e.age);
		System.gc();

		Student s = new Student();
		s = null;
		
		System.gc();
		System.out.println(s.name);

	}

}
