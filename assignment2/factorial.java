//Factorial Program using loop in java
import java.util.*;
public class factorial {
    public static void main(String args[]) {
        int i, n, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is " + fact);
        sc.close();
    }
    
}
