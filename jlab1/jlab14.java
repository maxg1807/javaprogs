
class Sumproductaverage2

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose : 			A Sample skeleton program


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	int number1;
    	int number2;
    	int number3;
    	int answer1;
    	int answer2;
    	int answer3;
    	int answer4;
    	int answer5;
    	int answer6;
    	int answer7;
    	int answer8;
    	int answer9;
    	
    	System.out.print("enter first number-> ");
    	number1 = EasyIn.getInt();
    	answer1 = number1;
    	answer2 = number1;
    	answer3 = number1;
    	System.out.println("the sum of the numbers is "+answer1);
    	System.out.println("the product of the numbers is "+answer2);
    	System.out.println("the average of the numbers is "+answer3);
    	System.out.print("enter second number-> ");
    	number2 = EasyIn.getInt();
    	answer4 = number1+number2;
    	answer5 = number1*number2;
    	answer6 = answer4/2;
    	System.out.println("the sum of the numbers is "+answer4);
    	System.out.println("the product of the numbers is "+answer5);
    	System.out.println("the average of the numbers is "+answer6);
    	System.out.print("enter third number-> ");
    	number3 = EasyIn.getInt();
    	answer7 = number1+number2+number3;
    	answer8 = number1*number2*number3;
    	answer9 = answer7/3;
    	System.out.println("the sum of the numbers is "+answer7);
    	System.out.println("the product of the numbers is "+answer8);
    	System.out.println("the average of the numbers is "+answer9);
    }
}

