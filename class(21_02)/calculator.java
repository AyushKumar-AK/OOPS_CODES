//WAP for calculator a= 10 b=5 to perform addition, subtraction, multiplication, division using member function and object.

class calculator
{
    int a=10,b=5;
    
    void add()
    {
        System.out.println("Addition is "+(a+b));
    }
    void sub()
    {
        System.out.println("Subtraction is "+(a-b));
    }
    void mul()
    {
        System.out.println("Multiplication is "+(a*b));
    }
    void div()
    {
        System.out.println("Division is "+(a/b));
    }
    public static void main(String args[])
    {
        calculator obj=new calculator();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}