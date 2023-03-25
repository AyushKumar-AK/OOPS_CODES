class animal {
    void eat(){
        System.out.println("Animal is eating");
    }

    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Bird extends animal {
    void eat(){
        System.out.println("Bird is eating");
    }

    void sleep(){
        System.out.println("Bird is sleeping");
    }

    void fly(){
        System.out.println("Bird is flying");
    }
}

class checkingInheritance {
    public static void main(String[] args){
        animal a = new animal();
        a.eat();
        a.sleep();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
