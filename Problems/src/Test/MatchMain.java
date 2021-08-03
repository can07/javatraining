package Test;

import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Match match = new ODIMatch();
		Match match1 = new T20Match();
		Match match2 = new TestMatch();

		float reqRunRate;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Match Format: ");
		int matchFormat;
		matchFormat = scan.nextInt();
		
		System.out.println("Enter the current Score");
		int currentscore = scan.nextInt();
		
		System.out.println("Enter the current Over");
		int currentover = scan.nextInt();
		
		System.out.println("Enter the target score");
		int target =scan.nextInt();
		
		switch (matchFormat) {
		case 1:

            System.out.println("ODI");
            
            match.calculateBalls(currentover);
            reqRunRate = match.calculateRunRate(currentscore, currentover, target);
            match.display(reqRunRate, currentover, target, currentscore, currentover);

            
            break;

      case 2:

            System.out.println("T20");
            
            match1.calculateBalls(currentover);
            reqRunRate = match1.calculateRunRate(currentscore, currentover, target);
            match1.display(reqRunRate, currentover, target, currentscore, currentover);

            
            break;

      case 3:

            System.out.println("Test");
            
            match2.calculateBalls(currentover);
            reqRunRate = match2.calculateRunRate(currentscore, currentover, target);
            match2.display(reqRunRate, currentover, target, currentscore, currentover);

            
            break;
            
      default:

          System.out.println("Invalid Format.");

          break;
		}
		
//		System.out.println("Enter the current Score");
//		int currentscore = scan.nextInt();
//		
//		System.out.println("Enter the current Over");
//		int currentover = scan.nextInt();
//		
//		System.out.println("Enter the target score");
//		int target =scan.nextInt();
	}

}
