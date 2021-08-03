package Test;

import java.util.Scanner;

public class Jhon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter the size of Array");
int size = scan.nextInt();

if(size<0) {
	
	System.out.println("Invalid Array size");
	System.exit(0);
}
int [] array = new int[size];
System.out.println("Enter the elements");
for(int i=0;i<size;i++) {
	//System.out.println("Enter the elements");
	array[i]=scan.nextInt();
	
	if(array[i]<0) {
		System.out.println("Invalid input");
		break;
	}
	
}

sumPrimeArray(array, size);


	}
	
	public static int  sumPrimeArray(int array[], int size) {
		int sum=0;
	for(int i=0; i<size; i++) {
		int count =0;
		for(int j=2;j<array[i]-1;j++) {
			if(array[i]%j==0) {
				count=count+1;
				break;
			}
			
		}
		
		if(count == 0 && array[i] != 1 ) {
			sum = sum + array[i];  
		}
		
		
	}
		
		System.out.println(sum);
		return sum;
		
	}

}
