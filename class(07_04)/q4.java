abstract class b{
    abstract void print();
    void show(){
        System.out.println("Hello");
    }
}

class d extends b{
    void print(){
        System.out.println("Hello");
    }
}

public class q4 {
    public static void main(String[] args) {
        d d = new d();
        d.print();
        d.show();
    }
}