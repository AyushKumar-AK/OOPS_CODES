//Write a program to take inpput of 5 subjects and find their percentage
import java.io.*;

public class percent {
    public static void main(String ar[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float num1, num2, num3, num4, num5;
        System.out.println("Enter Sub1 marks :");
        num1 = Float.parseFloat(br.readLine());
        System.out.println("Enter Sub2 marks :");
        num2 = Float.parseFloat(br.readLine());
        System.out.println("Enter Sub3 marks :");
        num3 = Float.parseFloat(br.readLine());
        System.out.println("Enter Sub4 marks :");
        num4 = Float.parseFloat(br.readLine());
        System.out.println("Enter Sub5 marks :");
        num5 = Float.parseFloat(br.readLine());
        float percentage = ((num1 + num2 + num3 + num4 + num5) / 500) * 100;
        System.out.printf("Percentage : %.2f", percentage);
    }
}
