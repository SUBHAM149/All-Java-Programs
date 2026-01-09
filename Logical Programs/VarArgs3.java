//WAP to show that var args can accept array variable values as well as direct value(both)
void main()
{
	//Passing array variable to var args
	int[]arr={1,2,3,4,5};
	accept(arr);
	IO.println("=============");
	//Passing directly value to var args
	accept(10,20,30,40,50);
}
public void accept(int...x)
{
	for(int y:x)
	{
		IO.println("Print the array data:"+y);
	}
}
