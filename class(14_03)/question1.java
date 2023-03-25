class fruit{
    String name;
    String taste;
    int size;

    fruit(){
        System.out.println("Default constructor");
    }

    fruit(String name, String taste){
        this.name = name;
        this.taste = taste;
        System.out.println("2 arg Parameterized constructor");
    }

    fruit(String name, String taste, int size){
        this.name = name;
        this.taste = taste;
        this.size = size;
        System.out.println("3 arg Parameterized constructor");
    }

    void eat(){
        System.out.println("Name: "+name);
        System.out.println("Taste: "+taste);
    }
}

class apple extends fruit{
    apple(String name, String taste){
        super(name, taste);
    }

    void eat(){
        super.eat();
    }
}

class orange extends fruit{
    orange(String name, String taste){
        super(name, taste);
    }
    void eat(){
        super.eat();
    }
}

class question1{
    public static void main(String[] args){
        apple obj1 = new apple("Apple", "Sweet");
        obj1.eat();
        orange obj2 = new orange("Orange", "Sour");
        obj2.eat();
    }
}