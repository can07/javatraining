package Test;

public class T20Match extends Match{

	@Override
	float calculateRunRate(int currentscore, float currentover, int target) {
		// TODO Auto-generated method stub
		double reqRunrate = (target - currentscore)/(20 - currentover);
		return (float) reqRunrate ;
	}

	@Override
	int calculateBalls(float currentover) {
		// TODO Auto-generated method stub
		int balls = (int) ((20 - currentover)/6);
		return balls;
	}

	@Override
	void display(double reqRunrate, int balls, int target, int currentscore, float currentover) {
		// TODO Auto-generated method stub
		
		int needRun = target - currentscore;
		int remBall = (int) ((20 - currentover) * 6); 
				
				System.out.println("Need " +needRun+ "runs in "+remBall+ "balls");
				System.out.println("Required Runrate: " +reqRunrate);
	}

}
