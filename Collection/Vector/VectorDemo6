package com.sub.vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

record Player(Integer id,String name,Double basePrice)
{
	
}

class IPLTeam
{
	private String name;
	private List<Player> listOfPlayers;
	
	public IPLTeam(String name)
	{
		this.name=name;
		listOfPlayers=new Vector<>();	
		
	}
	
	public void addPlayer(Player player)
	{
		listOfPlayers.add(player);
	}
	
	public void displayAllPlayers()
	{
		for(Player player : listOfPlayers)
		{
			IO.println(player);
		}
	}
	
	
	public void retainOrRemove()
	{
		Iterator<Player> iterator=listOfPlayers.iterator();
		
		while(iterator.hasNext());
		{
			Player player=iterator.next();
			if(player.basePrice() >=5000)
			{
				iterator.remove();
			}
		}
		
	}	
	
}

public class VectorDemo6 {

	public static void main(String[] args) {
		IPLTeam ipl=new IPLTeam("SRH");
		ipl.addPlayer(new Player(101,"Abhishek",5500D));
		ipl.addPlayer(new Player(102,"IshanKishan",5500D));
		ipl.addPlayer(new Player(103,"Head",5500D));
		ipl.addPlayer(new Player(104,"Kishan",5500D));
		ipl.addPlayer(new Player(105,"Cumins",5500D));
		ipl.addPlayer(new Player(106,"Nitish",5500D));
			
		
		ipl.displayAllPlayers();
		ipl.retainOrRemove();
		IO.println("After retrain OR remove, Final List : ");
		ipl.displayAllPlayers();
	}

}
OUTPUT
------
Player[id=101, name=Abhishek, basePrice=5500.0]
Player[id=102, name=IshanKishan, basePrice=5500.0]
Player[id=103, name=Head, basePrice=5500.0]
Player[id=104, name=Kishan, basePrice=5500.0]
Player[id=105, name=Cumins, basePrice=5500.0]
Player[id=106, name=Nitish, basePrice=5500.0]
