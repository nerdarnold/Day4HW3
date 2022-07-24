package day4hw3;

public class DiscountManager {
	private Gamer gamer;
	private double discountRate;
	final int THIS_YEAR = 2022;
	private int howManyYearsThatTheGamerExısts;
	int year = gamer.getTheYearThatTheGamerSignedUp();

	public Gamer getGamer() {
		return this.gamer = gamer;

	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public DiscountManager(int howManyYearsThatTheGamerExısts) {
		super();
		this.howManyYearsThatTheGamerExısts = howManyYearsThatTheGamerExısts;
	}

	public double getDiscountRate() {
		int howManyYearsThatTheGamerExısts = year - THIS_YEAR;
		if (howManyYearsThatTheGamerExısts < 1) {
			discountRate = discountRate;
		}
		if (howManyYearsThatTheGamerExısts >= 1) {
			discountRate = 0.05;
		}
		if (howManyYearsThatTheGamerExısts >= 2) {
			discountRate = 0.10;
		}
		this.discountRate = discountRate;
		return discountRate;
	}

}
