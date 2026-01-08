//Printing the table of number give by the user
void main()
{
	int num=Integer.parseInt(IO.readln("Enter a number:"));
	for(int i=1;i<=10;i++)
	{
		IO.println(num+"X"+i+"="+(num*i));
	}
}