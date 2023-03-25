//methjdo to find smallest of three numbers
import java.util.*;
public class smallest {
    public void small(int n,int j,int i){
        if(n<j && n<i)
        {
            System.out.println("The smallest number is "+n);
        }
        else if(j<n && j<i)
        {
            System.out.println("The smallest number is "+j);
        }
        else
        {
            System.out.println("The smallest number is "+i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the number");
        int j=sc.nextInt();
        System.out.println("Enter the number");
        int i=sc.nextInt();
        smallest obj=new smallest();
        obj.small(n,j,i);
        sc.close();
    }
    
}
