package com.gap.piggyBank;

import com.gap.util.Denomination;

public class PiggyBank {
	
	private int fiftyCoins;
	private int oneHundredCoins;
	private int twoHundredCoins;
	private int fiveHundredCoins;
	private int thousandCoins;
	
	
	public int getFiftyCoins() {
		return fiftyCoins;
	}
	public void setFiftyCoins(int fiftyCoins) {
		this.fiftyCoins = fiftyCoins;
	}
	public int getOneHundredCoins() {
		return oneHundredCoins;
	}
	public void setOneHundredCoins(int oneHundredCoins) {
		this.oneHundredCoins = oneHundredCoins;
	}
	public int getTwoHundredCoins() {
		return twoHundredCoins;
	}
	public void setTwoHundredCoins(int twoHundredCoins) {
		this.twoHundredCoins = twoHundredCoins;
	}
	public int getFiveHundredCoins() {
		return fiveHundredCoins;
	}
	public void setFiveHundredCoins(int fiveHundredCoins) {
		this.fiveHundredCoins = fiveHundredCoins;
	}
	public int getThousandCoins() {
		return thousandCoins;
	}
	public void setThousandCoins(int thousandCoins) {
		this.thousandCoins = thousandCoins;
	}
	
	public void addCoins(int fiftyCoins, int oneHundredCoins, int twoHundredCoins,
			int fiveHundredCoins, int thousandCoins) {
		this.fiftyCoins += fiftyCoins;
		this.oneHundredCoins += oneHundredCoins;
		this.twoHundredCoins += twoHundredCoins;
		this.fiveHundredCoins += fiveHundredCoins;
		this.thousandCoins += thousandCoins;
	}
	
	public int totalCoins() {
		
		return getFiftyCoins() + getOneHundredCoins() + getTwoHundredCoins()
		+ getFiveHundredCoins() + getThousandCoins();
		
	}
	
	public int totalCoinsByDenomination(Denomination denomination) {
		int result = 0;
		
		switch(denomination) {
		case FIFTY:
			result = getFiftyCoins();
		break;
		case ONE_HUNDRED:
			result = getOneHundredCoins();
		break;
		case TWO_HUNDRED:
			result = getTwoHundredCoins();
		break;
		case FIVE_HUNDRED:
			result = getFiveHundredCoins();
		break;
		case THOUSAND:
			result = getThousandCoins();
		break;
		default:
			System.out.println("The Denomination requested, don't exists!");
		break;
		}
		return result;
	}
}
