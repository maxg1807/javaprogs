
class Convertions1

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :a menu of different conversions



{
    public static void main(String[] args)
    {
    	int number;
    	double Fahrenheit;
    	double Celsius;
    	double Inches;
    	double Centimetres;
    	double Pounds;
    	double Kilograms;
    	double answer;
    	
    	System.out.println("1.Fahrenheit to celsius");
    	System.out.println("2.Celsius to Fahrenheit");
    	System.out.println("3.Inches to centimetres");
    	System.out.println("4.Centimetres to inches");
    	System.out.println("5.Pounds to Kilograms");
    	System.out.println("6.Kilograms to pounds");
    	System.out.print("enter from 1-6-> ");
    	number=EasyIn.getInt();
    	if(number==1)
    	{
    	System.out.print("enter Fahrenheit-> ");
    	Fahrenheit=EasyIn.getDouble();
    	answer=(5*(Fahrenheit-32))/9;
    	System.out.println("celsius="+answer);
    	}
    	else if(number==2)
    	{
    	System.out.print("enter Celsius-> ");
    	Celsius=EasyIn.getDouble();
    	answer=((Celsius*9)/5)+32;
    	System.out.println("Fahrenheit="+answer);
    	}
    	else if(number==3)
    	{
    	System.out.print("enter Inches-> ");
    	Inches=EasyIn.getDouble();
    	answer=Inches*2.54;
    	System.out.println("centimetres="+answer);
    	}
    	else if(number==4)
    	{
    	System.out.print("enter Centimetres-> ");
    	Centimetres=EasyIn.getDouble();
    	answer=Centimetres/2.54;
    	System.out.println("Inches="+answer);
    	}
    	else if(number==5)
    	{
    	System.out.print("enter pounds-> ");
    	Pounds=EasyIn.getDouble();
    	answer=Pounds*0.454;
    	System.out.println("kilograms="+answer);
    	}
    	else
    	{
    	System.out.print("enter kilograms->");
    	Kilograms=EasyIn.getDouble();
    	answer=Kilograms*2.2046;
    	System.out.println("pounds="+answer);
    	}
    	
    	
    
    }
}

