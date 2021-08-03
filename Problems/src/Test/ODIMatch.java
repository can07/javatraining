package Test;

public class ODIMatch extends Match {
	
	//ODIMatch odi = new ODIMatch();
	@Override
	float calculateRunRate(int currentscore, float currentover, int target ) {
		// TODO Auto-generated method stub
		
		double reqRunrate = (target - currentscore)/(50 - currentover);
		
		return (float) reqRunrate;
		
		
	}

	@Override
	int calculateBalls(float currentover) {
		// TODO Auto-generated method stub
		
		int balls = (int) ((50 - currentover)/6);
		return balls;
	}

	@Override
	void display(double reqRunrate, int balls, int target, int currentscore, float currentover) {
		// TODO Auto-generated method stub
int needRun = target - currentscore;
int remBall = (int) ((50 - currentover) * 6); 
		
		System.out.println("Need " +needRun+ "runs in "+remBall+ "balls");
		System.out.println("Required Runrate: " +reqRunrate);
	}

}
