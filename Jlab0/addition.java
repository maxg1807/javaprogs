class Addition
// Student Name : 		max gibney
// Student Id Number : 	C00300116
//
//A simple program that adds two numbers entered from the keyboard
//
{
	public static void main(String args[])
	{
		int number1;
		int number2;
		int answer;
		
		System.out.print("Enter the firts number-> ");
		number1 = EasyIn.getInt();
		System.out.print("enter the second number-> ");
		number2 = EasyIn.getInt();
		answer = number1 + number2;
		System.out.println("The sum of the two numbers is " + answer) ;
	}
}
