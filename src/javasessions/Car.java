package javasessions;

public class Car {

	//class variable or global variable
	String name;
	int price;
	String colour;
	static int wheels = 4;

	public static void main(String a[]) {
		
		String name = "raj"; //local variable
		System.out.println(name);
		
		int i =10;
		System.out.println(i);
		

		Car c1 = new Car();
		System.out.println(c1.name);//null
		c1.name = "BMW";
		c1.price = 39;
		c1.colour = "Blue";
		System.out.println(c1.name);//BMW
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 91;
		c2.colour = "Red";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 40;
		c3.colour = "Black";

		System.out.println(c1.name + " " + c1.price + " " + c1.colour);
		System.out.println(Car.wheels);

	}

}
