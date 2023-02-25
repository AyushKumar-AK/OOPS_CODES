//reverse the sum of digits of given input
import java.io.*;

public class reverse {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter a number: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br1.readLine());
        System.out.println("The number is: " + i);
        int sum = 0;
        while (i > 0) {
            int rem = i % 10;
            sum = sum + rem;
            i = i / 10;
        }
        System.out.println("The sum of digits is: " + sum);
        int rev = 0;
        while (sum > 0) {
            int rem = sum % 10;
            rev = rev * 10 + rem;
            sum = sum / 10;
        }
        System.out.println("The reverse of the sum is: " + rev);
    }
}
