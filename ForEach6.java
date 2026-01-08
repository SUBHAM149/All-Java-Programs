//WAP to cancanate all the values which are comming from Command line argument:
void main()
{
	String result="";
	for(String cmd : args)
	{
		result=result+cmd+"";
	}
	IO.println(result);
}