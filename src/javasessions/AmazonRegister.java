package javasessions;

import P1.Person;

public class AmazonRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Register reg = new Register();
		reg.Name = "Tom";
		reg.gender = 'm';

		reg.Name = "Peter";

		System.out.println(reg.Name);

		Register reg1 = new Register();
		reg1.Name = "Tom";
		System.out.println(reg1.Name);

		System.out.println(reg1.gender);

		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 20;
		e1.city = "LA";
		e1.salary = 12.33;

		Person p1 = new Person();
		Person p2 = new Person();

	}

}
