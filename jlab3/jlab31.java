
class Convertions2

// Student Name : 		max gibney
// Student Id Number : 	C00300116
// Date :				1/9/2005
// Purpose :a menu of different conversions that loops until the user exits



{
    public static void main(String[] args)
    {
    	
    	int number=0;
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
    	System.out.println("7.Exit Program");
    	System.out.print("enter from 1-7-> ");
    	number=EasyIn.getInt();
        
    	while(number!=7)
    	{
    	
    	switch(number)
    	{
    	case 1:System.out.print("enter Fahrenheit-> ");
    	Fahrenheit=EasyIn.getDouble();
    	answer=(5*(Fahrenheit-32))/9;
    	System.out.println("celsius="+answer);
    	break;
    	case 2:System.out.print("enter Celsius-> ");
    	Celsius=EasyIn.getDouble();
    	answer=((Celsius*9)/5)+32;
    	System.out.println("Fahrenheit="+answer);
    	break;
    	case 3:System.out.print("enter Inches-> ");
    	Inches=EasyIn.getDouble();
    	answer=Inches*2.54;
    	System.out.println("centimetres="+answer);
    	break;
    	case 4:System.out.print("enter Centimetres-> ");
    	Centimetres=EasyIn.getDouble();
    	answer=Centimetres/2.54;
    	System.out.println("Inches="+answer);
    	break;
    	case 5:System.out.print("enter pounds-> ");
    	Pounds=EasyIn.getDouble();
    	answer=Pounds*0.454;
    	System.out.println("kilograms="+answer);
        break;
    	case 6:System.out.print("enter kilograms->");
    	Kilograms=EasyIn.getDouble();
    	answer=Kilograms*2.2046;
    	System.out.println("pounds="+answer);
    	break;
        default:
    	System.out.println("goodbye");
    	}
    	System.out.println("1.Fahrenheit to celsius");
    	System.out.println("2.Celsius to Fahrenheit");
    	System.out.println("3.Inches to centimetres");
    	System.out.println("4.Centimetres to inches");
    	System.out.println("5.Pounds to Kilograms");
    	System.out.println("6.Kilograms to pounds");
    	System.out.println("7.Exit Program");
    	System.out.print("enter from 1-7-> ");
    	number=EasyIn.getInt();
    	}
        
    }
}

