package com.gap.piggyBank;

import java.util.Scanner;

import com.gap.util.Denomination;

/**
 * This method is responsible to show the options to the  user in the 
 * console, the user must select a valid option, and the correct 
 * method will be called 
 **/
public class OperationPiggyBank {
	
	Scanner scanner = new Scanner(System.in);
	
	public void initPiggyBank()
    {
    	PiggyBank piggyBank = new PiggyBank();
    	int denomination = 0;
    	int option = 0;
    	do {
    		showMenu();
    		try {
    			option = Integer.parseInt(scanner.nextLine());
    			switch (option) {
				case 1:
					addCoins(piggyBank);
				break;
				case 2:
					System.out.println("There are "+piggyBank.totalCoins()+" coins at Piggy Bank!");
				break;
				case 3:
					coinsByDenomination(piggyBank);
				break;
				case 4:
					System.out.println("Good Bye!");
					break;
				default:
					System.out.println("Invalid data, please try again!");
				break;
				}
    		}
    		catch (Exception e) {
    			System.out.println("Invalid data, please try again!");
			}
    	}while(option != 4);    	
    }
    
	/**
	 * it allows show Main Menu
	 **/
    public void showMenu() {
    	System.out.println("############ Wellcome to the Piggy Bank ###############");
    	System.out.println("Please read carefully our options...");
    	System.out.println("Press 1 To add a coin to the Piggy Bank.");
    	System.out.println("Press 2 To know how many coins are in the Piggy Bank.");
    	System.out.println("Press 3 To know how many coins are in the Piggy Bank by a specific denomination.");
    	System.out.println("Press 4 To exit.");
    	System.out.println("Please select one option!");
    	System.out.println("\n\n");
    }
    
    /**
	 * it allows show Denomination Menu
	 **/
    public void showDenomiantionMenu() {
    	System.out.println("=================== Denomination Menu =================");
    	System.out.println("Please read carefully our options...");
    	System.out.println("Press 1 to choice 50");
    	System.out.println("Press 2 to choice 100");
    	System.out.println("Press 3 to choice 200");
    	System.out.println("Press 4 to choice 500");
    	System.out.println("Press 5 to choice 1000");
    	System.out.println("\n\n");
    }
    
    /**
	 * it allows add coins at Piggy Bank
	 * @param piggyBank
	 **/
    public void addCoins(PiggyBank piggyBank) {
    	int denomination;
    	do{
			showDenomiantionMenu();
			try {
				denomination = 0;
				denomination = Integer.parseInt(scanner.nextLine());
				switch (denomination) {
				case 1:
					piggyBank.addCoins(1, 0, 0, 0, 0);
				break;
				case 2:
					piggyBank.addCoins(0, 1, 0, 0, 0);
				break;
				case 3:
					piggyBank.addCoins(0, 0, 1, 0, 0);
				break;
				case 4:
					piggyBank.addCoins(0, 0, 0, 1, 0);
				break;
				case 5:
					piggyBank.addCoins(0, 0, 0, 0, 1);
				break;
				default:
					System.out.println("Invalid data, please try again!");
				break;
				}
			}
			catch (Exception e) {
				System.out.println("Invalid data, please try again!");
				denomination =  0;
			}
		}while(denomination < 1 || denomination > 5);
    }
    
    /**
	 * it allows to select one denomination and the count 
	 * coins by denomination it will be called
	 * @param piggyBank
	 **/
    public void coinsByDenomination(PiggyBank piggyBank) {
    	int result = 0;
    	int denomination;
    	Denomination denominationType = null;
    	do{
			showDenomiantionMenu();
			try {
				denomination = 0;
				denomination = Integer.parseInt(scanner.nextLine());
				switch (denomination) {
				case 1:
					denominationType = Denomination.FIFTY;
				break;
				case 2:
					denominationType = Denomination.ONE_HUNDRED;
				break;
				case 3:
					denominationType = Denomination.TWO_HUNDRED;
				break;
				case 4:
					denominationType = Denomination.FIVE_HUNDRED;
				break;
				case 5:
					denominationType = Denomination.THOUSAND;
				break;
				default:
					System.out.println("Invalid data, please try again!");
				break;
				}
			}
			catch (Exception e) {
				System.out.println("Invalid data, please try again!");
				denomination =  0;
			}
		}while(denomination < 1 || denomination > 5);
    	result = piggyBank.totalCoinsByDenomination(denominationType);
    	System.out.println("There are "+result+" coins of "+denominationType+" denomination at Piggy Bank!");
    }
}
