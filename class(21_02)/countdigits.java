//take an input integer and count the number of digits in it

import java.io.*;

public class countdigits {
    public static void main (String args[]) throws IOException{
        System.out.println("Enter a number: ");
        BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br1.readLine());
        System.out.println("The number is: " + i);
        int count = 0;
        while (i > 0) {
            i = i / 10;
            count++;
        }
        System.out.println("The number of digits is:" +count);
    }
}
