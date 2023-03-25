//average of three number
import java.util.Scanner;
public class average {
    public void avg(int n,int j,int i){
        int sum=n+j+i;
        System.out.println("The average of the numbers is "+sum/3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the number");
        int j=sc.nextInt();
        System.out.println("Enter the number");
        int i=sc.nextInt();
        average obj=new average();
        obj.avg(n,j,i);
        sc.close();
    }

}
