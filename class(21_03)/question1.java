//dynamic mehtod dispatch

class A{
    void call(){
        System.out.println("Inside A's callme method");
    }
}

class B extends A{
    void call(){
        System.out.println("Inside B's callme method");
    }
}


class Dispatch{
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        A r;

        r = a;
        r.call();

        r = b;
        r.call();

    }
}