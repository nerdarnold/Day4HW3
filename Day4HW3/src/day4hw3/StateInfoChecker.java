package day4hw3;

public class StateInfoChecker {
	private boolean isValid;

	public boolean isValid(Gamer gamer) {
		if (gamer.getAge() >= 18) {
			return true;
		} else{
			return false;
		}
			
	}
}