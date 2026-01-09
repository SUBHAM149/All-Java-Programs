//WAP to show Var-args can accept hetrogeneous types of values.We can also print those values
void main()
{
	accept(1,2.3,'A',"JAVA",true);
	
}
public void accept(Object...x)
{
	for(Object y:x)
	{
		IO.println(y);
	}
}
