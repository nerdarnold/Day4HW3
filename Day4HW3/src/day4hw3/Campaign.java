package day4hw3;

public class Campaign {
	private DiscountManager discountManager;
	private double lolRP_Price = 2000;
	private double csGO_SkinPrice;
	private double valorantSkinPrice;

	public Campaign(DiscountManager discountManager) {
		super();
		this.discountManager = discountManager;
	}

	public double getLolRP_Price(DiscountManager discountManager) {

		return lolRP_Price * (1 - discountManager.getDiscountRate());
	}

	public double getCsGO_SkinPrice() {
		return csGO_SkinPrice - (discountManager.getDiscountRate() - csGO_SkinPrice);
	}

	public double getValorantSkinPrice() {

		return valorantSkinPrice - (discountManager.getDiscountRate() - valorantSkinPrice);
	}

}
