//check if the number is same as square of sum of digits of its reverse

import java.util.Scanner;

public class question4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        int sum = 0;
        while (rev != 0) {
            int rem = rev % 10;
            sum = sum + rem;
            rev = rev / 10;
        }
        int sq = sum * sum;
        if (sq == n) {
            System.out.println("The number is same as square of sum of digits of its reverse");
        } else {
            System.out.println("The number is not same as square of sum of digits of its reverse");
        }

    }

}
