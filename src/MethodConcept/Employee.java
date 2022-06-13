package MethodConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

	// WAF: getEmpDevices(String name)
	// return : ArrayList<String>

	public ArrayList<String> getEmpDevices(String name) {
		ArrayList<String> deviceList = new ArrayList<String>();
		System.out.println("emp name : " + name);

		if (name.equals("sri")) {
			deviceList.add("iph12");
			deviceList.add("iph13");
			deviceList.add("iph14");
		} else if (name.equals("Ravi")) {
			deviceList.add("sgh12");
			deviceList.add("sgh13");
			deviceList.add("sgh14");
		} else {
			System.out.println("emp is not found..." + name);
		}

		return deviceList;
	}

	public String[] getCompInfo(String compName) {
		String dept[] = new String[5];
		System.out.println("Comp name: " + compName);
		if (compName.equals("IBM")) {
			dept[0]= "HR";
			dept[1]= "admin";
			dept[2]= "finance";
		}
		
		else if (compName.equals("TCS")) {
			dept[0]= "HR";
			dept[1]= "admin";
			dept[2]= "finance";
			dept[3]= "QA";
			dept[4]= "Prodcut";
		}
		else {
			System.out.println("comp is not found "+ compName);
		}
		return dept;
	}

	public static void main(String[] args) {

		Employee obj = new Employee();
		ArrayList<String> empDevList = obj.getEmpDevices("Ravi");
		System.out.println(empDevList);
		
		String deptArr[] = obj.getCompInfo("IBM");
		System.out.println(Arrays.toString(deptArr));

	}

}

// static array - write a program
