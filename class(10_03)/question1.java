//check if we can call method of child class by using object of parent class

class Parent
{
    public void method1()
    {
        System.out.println("Parent class method");
    }
}

class child extends Parent
{
    public void method2()
    {
        System.out.println("Child class method");
    }
}

public class question1
{
    public static void main(String[] args)
    {
        Parent p = new Parent();
        p.method1();
        p.method2();
    }
}