package com.game;

public class Umpire
{

	int gussNum;int gussP1,gussP2,gussP3;
	Guesser g=new Guesser();
	Players p1=new Players();
	Players p2=new Players();
	Players p3=new Players();
	GusserMain main=new GusserMain ();
	
	void collectNumFromGusser()
	{
		gussNum=g.GusserNumber();	
	}
	void collectNumFromPlayers()
	{
		gussP1=p1.PlayerGusserNumber1();
		gussP2=p2.PlayerGusserNumber2();
		gussP3=p3.PlayerGusserNumber3();
	}
	void compare()
	{
		//System.out.println(gussNum+" "+gussP1+" "+gussP2+" "+gussP3);
		if(gussNum==gussP1&& gussNum==gussP2&& gussNum==gussP3 )
		{
			System.out.print(" All Players Gussed Correctly");
		}
		else
		{
			if(gussNum==gussP1 )
			{
	
				System.out.print(" Player1");
					if(gussNum==gussP2 )
					{
						System.out.print(" and Player2 Gussed Correctly");
					}
					else if(gussNum==gussP3 )
					{
						System.out.print(" and Player3 Gussed Correctly");
					}
					
			}
			else if(gussNum==gussP2 )
			{
	
				System.out.print(" Player2");
					if(gussNum==gussP1 )
					{
						System.out.print(" and Player1 Gussed Correctly");
					}
					else if(gussNum==gussP3 )
					{
						System.out.print(" and Player3 Gussed Correctly");
					}
			}
			else if(gussNum==gussP3 )
			{
	
				System.out.print(" Player3");
					if(gussNum==gussP1 )
					{
						System.out.print(" and Player1 Gussed Correctly");
					}
					else if(gussNum==gussP2 )
					{
						System.out.print(" and Player2 Gussed Correctly");
					}
			}
			else
			{
				System.out.println("All Players Gussed Incorrectly");
				System.out.println("Again i am Giving one more chance care fully give");
				main.GusserMain1();
			}
		}
		
	}
}
