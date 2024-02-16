class Measurments
// Student Name : 		max gibney
// Student Id Number : 	C00300116
//
// a simple program to convert inches to centimeters
//
{
	public static void main(String args[])
	{
	double inches;
	double answer;
	
	System.out.print("enter measurment in inches-> ");
	inches = EasyIn.getInt();
	answer = inches * 2.54;
	System.out.println("the measurment in centimeters is "+answer);
	}
}