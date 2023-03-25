//multiple inheritance

class A
{
    int a;
    void geta(int x)
    {
        a=x;
    }
}

class B
{
    int b;
    void getb(int y)
    {
        b=y;
    }
}

class C extends A,B
{
    void sum()
    {
        System.out.println("Sum is "+(a+b));
    }
}

class check2{
    public static void main(String args[]){

        C obj=new C();
        obj.geta(10);
        obj.getb(20);
        obj.sum();
        
    }
}