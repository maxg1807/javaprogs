class Multiplication
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
		int number3;
		int answer;
		
		System.out.print("Enter the firts number-> ");
		number1 = EasyIn.getInt();
		System.out.print("enter the second number-> ");
		number2 = EasyIn.getInt();
		System.out.print("enter the third number-> ");
		number3 = EasyIn.getInt();
		answer = number1*number2*number3;
		System.out.println("The sum of the 3 numbers is " + answer) ;
	}
}