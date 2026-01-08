//Print the massage based on the grade
void main()
{
	IO.println("Enter your Subject grade[A/B/C/D/E]");
	char grade=IO.readln().toUpperCase().charAt(0);
	
	String result=switch(grade)
	{
		case 'A','B'->"EXCELENT!!!";
		case 'C'->"Very Good!!";
		case 'D'->"Good!";
		case 'E'->"Averege";
		default->"Fail";	
	};
	IO.println("Student Grade is: "+result);
}
