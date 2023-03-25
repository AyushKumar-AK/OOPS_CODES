//method to sum of the digiits of a number
import java.util.*;
public class sum {
    public void sumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("The sum of the digits is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sum obj=new sum();
        obj.sumOfDigits(n);
        sc.close();
    }
    
}
