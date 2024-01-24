package com.logical;

import java.util.Scanner;

public class ProfitLoss {
	public static void main(String[] args) {
		System.out.println("Enter Cost Price and Sell Price--");
		Scanner sc = new Scanner(System.in);
		int CostPrice=sc.nextInt();
		int SellPrice=sc.nextInt();
		if(CostPrice<SellPrice) {
			int Profit=SellPrice-CostPrice;
			System.out.println("Profit of "+Profit+" rupees");
		}
		else {
			int Loss=CostPrice-SellPrice;
			System.out.println("Loss of "+Loss+" rupees");

		}
	}
}
