void main()
{
    int x=  Integer.parseInt(IO.readln());
    int y=Integer.parseInt(IO.readln());
    String opt=IO.readln().toUpperCase();
    int result=switch(opt)
    {
        case "ADD"->{yield (x+y);}
        case "SUB"->{yield (x-y);}
        case "MUL"->{yield (x*y);}
        case "DIV"->{yield (x/y);}
        default ->{yield 0;}
    };
    IO.println("Result: "+result);
    
}