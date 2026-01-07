void main()
{
	accept(10,2.3,8.9,5.6);
}
public void accept(int x,double...y)
{
	IO.println("x value is:"+x);
	for(double z:y)
	{
		
		IO.println(z);
	}
}
