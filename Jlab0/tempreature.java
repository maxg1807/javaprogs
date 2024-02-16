class Tempreature
// Student Name : 		max gibney
// Student Id Number : 	C00300116
//
//A simple program that converts fahrenheit to celcius entered from the keyboard
//
{
	public static void main(String args[])
	{
		int fahrenheit;
		int answer;
		
		System.out.print("enter fareheit-> ") ;
		fahrenheit = EasyIn.getInt() ;
		answer = 5/9*(fahrenheit-32) ;
		System.out.println("the convertion to celcius is"+ answer);
		
	}
}