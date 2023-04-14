import java.util.Scanner;

class adam{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sq=n*n;
        int rev=0;
        int sq1=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        int sqrev=rev*rev;

        while (sq!=0){
            int rem=sq%10;
            sq1= sq1*10+rem;
            sq=sq/10;
        }

        if (sqrev==sq1){
            System.out.println("Adam number");
        }
        else{
            System.out.println("Not Adam number");
        }

        scanner.close();
    }
}
