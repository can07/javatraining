package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class IPLSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the top 5 scores of IPL season 13");
	for(int i=0;i<5;i++) {
	
	list1.add(scan.nextLine());
	
	//list1 = season13.split(season13)
	//System.out.println(season13);
	}
		ArrayList<String> list2 = new ArrayList<String>();
		System.out.println("Enter the top 5 scores of IPL season 12");
		//String season12 = scan.nextLine();
		for(int i=0;i<5;i++) {
			
			list2.add(scan.nextLine());
			
			//list1 = season13.split(season13)
			//System.out.println(season13);
			}
		//season13.ret
		
		list1.retainAll(list2);
		
		System.out.println("Consistent run scorers:"+ list1);
	}

}
