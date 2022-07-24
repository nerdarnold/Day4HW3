package day4hw3;

public class Main {

	public static void main(String[] args) {
		Gamer ata = new Gamer("18", "Ata", "Yesilyurt", "asd", "dsa", null, null, 15, 2015);
		Gamer zafer = new Gamer("30", "zaf", "alt", "asd", "dsa", "qs", "null", 98, 2022);
		GamerManager gamerManager = new GamerManager(5);
		Gamer[] myGamers = { ata, zafer };
		gamerManager.login(myGamers);
		StateInfoChecker stateInfoChecker = new StateInfoChecker();
		DiscountManager mng = new DiscountManager(5);
		// aradaki böyle bir check olsun diye yaş sınırı koydum
		// diğer türlü if exist in database olması gerek sanırım
		// elimizde veritabanı olmadıgı için böyle simüle ettim
		System.out.println(stateInfoChecker.isValid(ata));
		}

}
