//method to count all vowels in a string
import java.util.*;
public class vowels {

    public void countVowels(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println("The number of vowels in the string is "+count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        vowels obj=new vowels();
        obj.countVowels(s);
        sc.close();
    }
    
}
