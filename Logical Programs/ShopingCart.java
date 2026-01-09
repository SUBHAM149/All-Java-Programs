//Shoping Cart
void main()
{
	double items[]={500,200,450};
	processPayment("Scott",items);
	processPayment("Alean",500,200,1000,200,5000);
}
public void processPayment(String customerName,double...prices)
{
	double bill=0.0;
	for(double price:prices)
	{
		bill=bill+price;
	}
	IO.println("CustomerName is :"+customerName+"and bill is:"+bill);
}