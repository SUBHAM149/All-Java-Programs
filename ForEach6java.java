//Wap to Add all the numbers(find out the sum of all the array integer)from the array;
//------------------------------------------------------------------------------------
void main()
{
	int []values={10,20,30,40,50,60};
	int sum=0;
	for(int value:values)
	{
		sum=sum+value;
	}
	IO.println("Sum of all the values are:"+sum);
}