
class Loan

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			calculate the total amount of repayment on a loan


{
    public static void main(String[] args)
    {
    	double loanamount;
    	double intrestrate;
    	double years;
    	double answer;
    	
    	System.out.print("enter loan amount-> ");
    	loanamount = EasyIn.getDouble();
    	System.out.print("enter intrest rate in decimal +1-> ");
    	intrestrate = EasyIn.getDouble();
    	System.out.print("enter number of years loan was taken out for-> ");
    	years = EasyIn.getDouble();
    	answer = loanamount*intrestrate^years;
    	System.out.println("repayment due on loan is "+answer);
    }
}

