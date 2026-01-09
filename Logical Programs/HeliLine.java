void main()
{
	IO.println("\t\t**Main Menu**\n");
	IO.println("\t\t**100 Police**\n");
	IO.println("\t\t**101 fire**\n");
	IO.println("\t\t**102 ambulance**\n");
	IO.println("\t\t**139 Railway**\n");
	IO.println("\t\t**181 Womens Helpline**\n");
	
	IO.println("Enter your choice: ");
	int choice=Integer.parseInt(IO.readln());
	
	switch(choice)
	{
		case 100->IO.println("Police service");
		case 101->IO.println("Fire");
		case 102->IO.println("Ambulance");
		case 139->IO.println("Railway");
		case 181->IO.println("Womens helpline");
		default->IO.println("Your choice is Wrong");
	}
	
}
