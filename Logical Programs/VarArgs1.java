//Wap to show that ver args can accept 0 to n number of arguments
void main()
{
	accept();
	accept(10);
	accept(10,20);
	accept(10,20,30);
	accept(10,20,30,40);
}
void accept(int ...x)
{
	IO.println("Will accept all the argument");
}

