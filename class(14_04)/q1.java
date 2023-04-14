//calculator performing basic arithmeitc operations free of exceptions

import java.util.*;

class q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the number for operation \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Remainder");
        int n = sc.nextInt();
        try{
        switch(n)
        {
            case 1:
                System.out.println("Sum = "+(a+b));
                break;
            case 2:
                System.out.println("Difference = "+(a-b));
                break;
            case 3:
                System.out.println("Product = "+(a*b));
                break;
            case 4:
                System.out.println("Quotient = "+(a/b));
                break;
            case 5:
                System.out.println("Remainder = "+(a%b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
    catch(ArithmeticException e)
    {
        System.out.println("Division by zero is not possible");
    }
    
    catch(InputMismatchException e)
    {
        System.out.println("Invalid input");
    }
    catch(NumberFormatException e)
    {
        System.out.println("Invalid input");
    }
    catch(Exception e)
    {
        System.out.println("Invalid input");
    }
    
    }
    }



