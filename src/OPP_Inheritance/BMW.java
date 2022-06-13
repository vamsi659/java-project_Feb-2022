package OPP_Inheritance;

public class BMW extends Car {

	//Method Overrding: Poly + Morphism: RunTime(Dynamic)
	//when you have a method in parent class as well as in child class
	//with the same name
	//and with the same number of parameters
	//and same return type
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking...");
	}
		// method hiding
		public static void seating() {
			System.out.println("BMW -- seating");
		}

		private void getLicenseNumber() {
			System.out.println("BMW -- license : 12345");
	}
}
