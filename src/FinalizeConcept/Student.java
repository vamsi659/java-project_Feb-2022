package FinalizeConcept;

public class Student {
	
	public String name = "tom";
	
	@Override
	public void finalize() {
		System.out.println("student -- finalize method");

	}

	public static void main(String[] args) {
		
		

	}

}
