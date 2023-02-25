//write a program to take an integer input and find its first divisor
import java.io.*;


class firstdivisor
{  
    public static void main(String args[] ) throws IOException
        {
            System.out.println("Enter a number");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i = Integer.parseInt(br.readLine());
            System.out.println("The number is: " + i);
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println("The first divisor of the number is: " + j);
                    break;
                }
            }
        }
}