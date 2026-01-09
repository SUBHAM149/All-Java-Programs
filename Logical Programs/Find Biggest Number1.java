//find the bigest among 3  number
void main()
{
	int x=Integer.parseInt(IO.readln("Enter The value of x:"));
	int y=Integer.parseInt(IO.readln("Enter The value of y:"));
	int z=Integer.parseInt(IO.readln("Enter The value of z:"));
	
	int big=0;
	if(x>y)
	{
	if(x>z)
		{
			big=x;
		}
		else
		{
			big=z;
		}
	}
	else
	{
	if(y>z)
		{
			big=y;
		}
		else
		{
			big=z;
		}
	}
	IO.println("Big number is:"+big);
}
