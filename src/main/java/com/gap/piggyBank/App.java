package com.gap.piggyBank;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.gap.util.Denomination;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PiggyBank piggyBank = new PiggyBank();
    	Scanner scanner = new Scanner(System.in);
    	int denomination = 0;
    	int option = 0;
    	do {
    		showMenu();
    		try {
    			option = scanner.nextInt();
    			switch (option) {
				case 1:
					do{
						try {
							denomination = 0;
							denomination = scanner.nextInt();
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
					}while(denomination < 1 && denomination > 5);
				break;
				case 2:
					System.out.println("There are "+piggyBank.totalCoins()+" coins at Piggy Bank!");
				break;
				case 3:
					int result = 0;
					do{
						try {
							denomination = 0;
							denomination = scanner.nextInt();
							switch (denomination) {
							case 1:
								result = piggyBank.totalCoinsByDenomination(Denomination.FIFTY);
							break;
							case 2:
								result = piggyBank.totalCoinsByDenomination(Denomination.ONE_HUNDRED);
							break;
							case 3:
								result = piggyBank.totalCoinsByDenomination(Denomination.TWO_HUNDRED);
							break;
							case 4:
								result = piggyBank.totalCoinsByDenomination(Denomination.FIVE_HUNDRED);
							break;
							case 5:
								result = piggyBank.totalCoinsByDenomination(Denomination.THOUSAND);
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
					}while(denomination < 1 && denomination > 5);
					System.out.println("There are "+result+" coins of that denomination at Piggy Bank!");
				break;
				case 4:
					System.out.println("Good Bye!");
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
    
    public static void showMenu() {
    	System.out.println("############ Wellcome to the Piggy Bank ###############");
    	System.out.println("Please read carefully our options...");
    	System.out.println("Press 1 To add a coin to the Piggy Bank.");
    	System.out.println("Press 2 To know how many coins are in the Piggy Bank.");
    	System.out.println("Press 3 To know how many coins are in the Piggy Bank by a specific denomination.");
    	System.out.println("Press 4 To exit.");
    	System.out.println("Please select one option!");
    }
    
    public static void showDenomiantionMenu() {
    	System.out.println("=================== Denomination Menu =================");
    	System.out.println("Please read carefully our options...");
    	System.out.println("Press 1 to choice 50");
    	System.out.println("Press 2 to choice 100");
    	System.out.println("Press 3 to choice 200");
    	System.out.println("Press 4 to choice 500");
    	System.out.println("Press 5 to choice 1000");
    }
}
