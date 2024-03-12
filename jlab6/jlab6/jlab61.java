import java.util.Scanner;

class jlab61

// a method that determines if a number is even or odd

{
    
    public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("enter number -> ");
            int input = scan.nextInt(); 
            boolean boo = isEven(input);
            if(boo == true)
                {
                    System.out.println("is even");
                }
            else
                {
                    System.out.println("is odd");
                }
        }
    static boolean isEven(int input)
        {
        boolean boo = false;
        if(input % 2 ==0)
                {
                    boo = true;
                }
          return boo;
        }
}