import java.io.*;
// take a string input and find its length
public class stringlength {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter a string");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("The string is: " + str);
        System.out.println("The length of the string is: " + str.length());
    }
}
