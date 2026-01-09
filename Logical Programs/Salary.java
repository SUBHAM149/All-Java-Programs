void main()
{
	IO.println("Enter your performance grade[A/B/C]: ");
	char grade=IO.readln().toUpperCase().charAt(0);
	double salary=40000;
	double bonus=switch(grade)
	{
		case 'A'->
		{
			IO.println("Heigh level Performance");
			yield salary*0.20;
		}
		case 'B'->
		{
			IO.println("Mid level performance");
			yield salary*0.15;
		}
		case 'C'->
		{
			IO.println("Basic level performance");
			yield salary*0.10;
		}
		default ->salary*0.5;	
	};
	IO.println("Your Salary is:"+salary);
	IO.println("Your bonus amount is: "+bonus);
}