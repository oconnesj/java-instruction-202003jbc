package ui;

import util.Console;

import java.text.NumberFormat;

class BattingStatisticsApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Batting Stats App!");

		String choice = "y";
		// - start loop
		while (choice.equalsIgnoreCase("y")) {
			// get user input
			// int at bat
			// - int[] results
			int atBat = Console.getInt("Enter number of of times at bat: ", 0,31);
			System.out.println();
			int[] results = new int[atBat];
			for (int i=0; i < results.length; i++) {
				
				int result = Console.getInt("Results for at-bat "+(i+1)+":",
											-1,5);
			}
			System.out.println();

			// Business Logic
			// - double battingAvg = results[] > 0 / at bat
			// - double sluggingPct = baseEarned / at bat
			int atBatsGreaterThanOne = 0;
			int basesEarned = 0;
			for (int result: results)
				{
				basesEarned += result;
				if (result > 0)
					atBatsGreaterThanOne ++;
				
			}
			
			double battingAvg = atBatsGreaterThanOne / (double) atBat;
			double sluggingPct = basesEarned /(double) atBat;
			// Display Results - battingAbg, sluggingPct
			NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setMinimumFractionDigits(3);
			nf.setMaximumFractionDigits(3);
			System.out.println("Batting average:  "+nf.format(battingAvg));
			System.out.println("Slugging percent: "+nf.format(sluggingPct));

			// end loop
			choice = Console.getString("Continue? (y/n): ",true);
		}

	}

}
