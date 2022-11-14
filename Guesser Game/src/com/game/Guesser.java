package com.game;
import java.util.Scanner;
public class Guesser
{
	
	Scanner sc=new Scanner(System.in);
	GussersFields gf1=new GussersFields() ; int num;
	int GusserNumber()
	{
		
		Guesser gg=new Guesser();
		System.out.println("Gusser Kindly Enter your number: ");
		gf1.setGuesserNum(sc.nextInt());
		int num=gf1.getGuesserNum();
		
		if(num<0 || num>10)
		{
			System.out.println("Kindly Enter your number: in between (0 to 11) ");
			GusserNumber();
		}
		return gf1.getGuesserNum();
	}

}
