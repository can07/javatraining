package Test;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company obj = new Company();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Company name");
		String name = scan.nextLine();
		//System.out.println("Name :" +name);
		System.out.println("Enter the employees name");
		String employees = scan.nextLine();
		System.out.println("Enter the TemLead");
		String teamlead = scan.nextLine();
		String[] array =employees.split(",");
		boolean flag=false;
		for(String list:array){  
			//System.out.println(list); 
			if (teamlead.equals(list)) {
				flag=true;
			}
			}
		if(!(flag)) {
			System.out.println("Invalid output");
			
		}else {
			System.out.println("Name : " + name);
			System.out.println("Employees : " + employees);
			System.out.println("Teamlead : " + teamlead);
		}
	}

}
