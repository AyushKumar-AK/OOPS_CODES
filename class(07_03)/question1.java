class A1{
    A1(){
        System.out.println("A1's no arguement constructor");
    }
    A1(int a){
        System.out.println("A1's argument constructor "+ a);
    }
}

class B1 extends A1{
    B1(){
        System.out.println("B1's no arguement constructor");
    }
    B1(int b){
        super(1000);
        System.out.println("B1's argument constructor "+ b);
    }
}

class C1 extends B1{
    C1(){
        System.out.println("C1's no arguement constructor ");
    }
    C1(int c){
        super(100);
        System.out.println("C1's argument constructor "+ c);
    }
}

class TestingInheritance{
    public static void main(String[] args){
        C1 ca = new C1(10);
    }
}