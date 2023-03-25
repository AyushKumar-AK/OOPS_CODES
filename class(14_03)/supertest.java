class a{
    int employeeno;
    String name;
    a(){
        System.out.println("Default constructor");
    }

    a(int employeeno){
        this.employeeno = employeeno;
        System.out.println("1 arg Parameterized constructor");
    }

    a(int employeeno, String name){
        this.employeeno = employeeno;
        this.name = name;
        System.out.println("2 arg Parameterized constructor");
    }

    void display(){
        System.out.println("Employee no: "+employeeno);
        System.out.println("Name: "+name);
    }
}

class b extends a{
    String departmentname;

    b(int employeeno, String name, String departmentname){
        super(employeeno, name);
        this.departmentname = departmentname;
        System.out.println("Sub class Parameterized constructor");
    }

    void display(){
        super.display();
        System.out.println("Department name: "+departmentname);
    }
}

class supertest{
    public static void main(String[] args){
        b obj = new b(1, "Rahul", "IT");
        obj.display();
    }
}