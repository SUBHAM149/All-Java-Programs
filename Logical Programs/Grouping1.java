//Grouping Program
void main()
{
	int data=Integer.parseInt(IO.readln("Enter a Number: "));
	switch(data)
	{
		case 2,4,6,8->IO.println("It is even Number");
		case 1,3,5,7->IO.println("It is odd Number");
		default->IO.println("Invalid Number");
	}
}