package com.game;
public class GusserMain 
{
	static Umpire um=new Umpire();
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO GUSSER GAME :)");
		um.collectNumFromGusser();
		GusserMain1();
	}
	static void GusserMain1()
	{
		um.collectNumFromPlayers();
		um.compare();
	}

}
