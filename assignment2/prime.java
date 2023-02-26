//Write a java program to check whether a given number is prime or not.
import java.util.*;
public class prime {
    public static void main(String args[]) {
        int i, n, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        n = sc.nextInt();
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The number "+ n+ " is not prime");
        } else {
            System.out.println("The number "+ n +" is prime");
        }
        sc.close();
    }
    
}
