//compile time and run time polymorphism example

class apple{
    void show(){
        System.out.println("In apple class");
    }
}

class orange extends apple{

    void show(){
        System.out.println("In orange class");
    }
    //method overloading
    void show(int a){
        System.out.println("In orange class but with integer argument");
    }

}

class testquestion3{
    public static void main(String args[]){
        apple a = new apple();
        orange o = new orange();

        a.show();
        o.show();
        o.show(5);
    }
}

//can we call main method of an other class using its object in a different class?


