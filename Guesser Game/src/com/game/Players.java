package com.game;

import java.util.Scanner;

public class Players
{
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	GussersFields gf1= new GussersFields();
	int PlayerGusserNumber1()
	{
		System.out.println("Player1 Kindly Enter your number: ");
		gf1.setNumFromPlayer1(sc.nextInt());
		num1=gf1.getNumFromPlayer1();
		if(num1<0 || num1>10)
		{
			System.out.println("Kindly Enter your number: in between (0 to 11) ");
			PlayerGusserNumber1();
		}
		return gf1.getNumFromPlayer1();
	}
	
	int PlayerGusserNumber2()
	{
		System.out.println("Player2 Kindly Enter your number: ");
		gf1.setNumFromPlayer2(sc.nextInt());
		num2=gf1.getNumFromPlayer2();
		if(num2<0 || num2>10)
		{
			System.out.println("Kindly Enter your number: in between (0 to 11) ");
			PlayerGusserNumber2();
		}
		return gf1.getNumFromPlayer2();
	}
	
	int  PlayerGusserNumber3()
	{
		System.out.println("Player3 Kindly Enter your number: ");
		gf1.setNumFromPlayer3(sc.nextInt());
		num3=gf1.getNumFromPlayer3();
		if(num3<0 || num3>10)
		{
			System.out.println("Kindly Enter your number: in between (0 to 11) ");
			PlayerGusserNumber3();
		}
		return gf1.getNumFromPlayer3();
	}
}
