package day4hw3;

public class GamerManager extends DiscountManager {
	private int howManyYearsThatTheGamerExısts;
	public GamerManager(int howManyYearsThatTheGamerExısts) {
		super(howManyYearsThatTheGamerExısts);
		this.howManyYearsThatTheGamerExısts=howManyYearsThatTheGamerExısts;
	}

	Gamer[] gamers;

	public void login(Gamer[] gamers) {
		for (Gamer gamer : gamers) {
			System.out.println("Gamer has logon: " + gamer.getFirstName());
		}
	}

	public void logoff(Gamer[] gamer) {
		for (Gamer gamer1 : gamers) {
			System.out.println("Gamer has logon: " + gamer1.getFirstName());
		}
	}

	public void update(Gamer[] gamer) {
		for (Gamer gamer2 : gamers) {
			System.out.println("Gamer has logon: " + gamer2.getFirstName());
		}
	}

}
