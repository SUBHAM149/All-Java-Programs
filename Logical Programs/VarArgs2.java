//Wap to show that var args can accept different types of parameters also
void main()
{
	accept();
	accept(10);
	accept(10,20.90);
	accept(10,20,90,'A');
	accept(10,20,90,'A');
	accept(10,20,90,'A',"NIT");
}
void accept(Object...x)
{
	IO.println("All types are allowed.");
}
