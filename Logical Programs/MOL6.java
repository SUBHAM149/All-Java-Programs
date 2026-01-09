void main()
{
	accept(9);
}
public void accept(byte b)
{
	IO.println("byte");
}
public void accept(short b)
{
	IO.println("short");
}
//By default 9 is int type so we cannot assign to byte OR short(both are below than int)