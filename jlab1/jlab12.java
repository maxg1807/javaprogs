class Distance
// Student Name : 		max gibney
// Student Id Number : 	C00300116
//
// a simple program to us disrance,time,and gallons of petrol used to calculate the average miles per hour and miles to the gallon
//
{
	public static void main(String args[])
	{
		int miles;
		int hours;
		int fuelused;
		int answer1;
		int answer2;
		
		System.out.print("enter number of miles traveled-> ");
		miles = EasyIn.getInt();
		System.out.print("enter time taken in hours-> ");
		hours = EasyIn.getInt();
		System.out.print("enter amount of fuel used in gallons-> ");
		fuelused = EasyIn.getInt();
		answer1 = miles / hours;
		answer2 = fuelused / hours;
		System.out.println("the average miles per hour is "+ answer1);
		System.out.println("and the number of miles per gallon is "+ answer2);
	}
}