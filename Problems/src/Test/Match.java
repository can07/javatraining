package Test;

public abstract class Match {
private int currentscore;
private float currentover;
private int target;
public int getCurrentscore() {
	return currentscore;
}
public void setCurrentscore(int currentscore) {
	this.currentscore = currentscore;
}
public float getCurrentover() {
	return currentover;
}
public void setCurrentover(float currentover) {
	this.currentover = currentover;
}
public int getTarget() {
	return target;
}
public void setTarget(int target) {
	this.target = target;
}


abstract float calculateRunRate(int currentscore, float currentover, int target);
abstract int calculateBalls(float currentover);
abstract void display(double reqRunrate, int balls, int target, int currentscore,float currentover);
}
