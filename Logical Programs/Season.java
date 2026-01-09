void main()
{
	IO.println("Enter the name of the season");
	String season=IO.readln().toUpperCase();
	switch(season)
	{
		case"SUMMER"->IO.println("Summer Season");
		case"WINTER"->IO.println("Winter season");
		case"SPRING"->IO.println("Spring Season");
		case"RAINY"->IO.println("Rainy Season");
		default ->IO.println("No Valid Season");
	}
}
