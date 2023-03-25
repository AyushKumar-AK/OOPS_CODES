//constructor overloading

class question3
{
    int a,b;
    question3()
    {
        a=0;
        b=0;
    }
    question3(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("a="+a+" b="+b);
    }
    public static void main(String args[])
    {
        question3 ob1=new question3();
        question3 ob2=new question3(10,20);
        ob1.display();
        ob2.display();
    }
}
