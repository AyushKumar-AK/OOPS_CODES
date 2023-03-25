//method to check whether a number is even or odd 
import java.util.*;
public class evenorodd {
    public void evenOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        evenorodd obj=new evenorodd();
        obj.evenOdd(n);
        sc.close();
    }
    
}
