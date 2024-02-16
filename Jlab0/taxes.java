class Taxes
// Student Name : 		max gibney
// Student Id Number : 	C00300116
// 
//a Simple program to prompt the user for their annual income and number of kids to work out the amount of tax due
//
{ public static void main(String args[])
  {
	double annualincome;
	double numberofkids;
	double answer;
	
	System.out.print("enter your annual income -> ");
	annualincome = EasyIn.getInt();
	System.out.print("enter your number of kids ->");
	numberofkids = EasyIn.getInt();
	answer = ((annualincome-5000)+(numberofkids*1000))*0.24;
	System.out.println("the total taxes to be paid is "+answer);
  }
}