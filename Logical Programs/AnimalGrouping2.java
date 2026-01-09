void main()
{
	IO.println("Enter an animal Name");
	String animal=IO.readln().toLowerCase();
	
	switch(animal)
	{
	case"dog","cat","cow","sheep"->
	{
	 IO.println("It is a domastic animal");
	}
	case "lion","tiger","elephant","wolf"->
	{
	 IO.println("It is a wild animal");
	}
	 default->
		{
			IO.println("UNKOWN ANIMAL");
		}
	
	}
}