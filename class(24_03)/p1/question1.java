package p1;
//create a package p1

//contains 3 variable and create a constructor to initialize the variable and write a method to calculate the sum.

public class question1 {
    protected int a,b,c;
    public question1(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void sum(){
        System.out.println("Sum of three numbers is:" +(a+b+c));
    }
}

