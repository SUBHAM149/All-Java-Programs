//WAP to show how to add parameter variable values by using var args
void main()
{
	accept(10,20,3040,50);
	IO.println("...........");
	
	int arr[]={100,200,300};
	accept(arr);
}
public void accept(int...x)
{
	int sum=0;
	for(int y:x)
	{
		sum=sum+y;
	}
	IO.println("Sum of Parameter is:"+sum);
}
