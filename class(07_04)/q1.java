class author{
    String name;
    String email;
    char gender;
    author(String name, char gender){
        this.name=name;
        this.gender=gender;

    }

}
//add authornname in class book using super
class book extends author{
    String bname;
    double price;
    int qty;
    char gender;
    book(String name,String bname,double price,int qty, char gender){
        super(name,gender);
        this.name=name;
        this.price=price;
        this.qty=qty;
        this.bname=bname;
    }
    void display(){
        System.out.println("Author name: "+name);
        System.out.println("Book name: "+bname);
        System.out.println("Book price: "+price);
        System.out.println("Book quantity: "+qty);
    }

}

public class q1 {
    public static void main(String[] args) {
        book b=new book("Ayush","Java", 100, 10, 'M');
        b.display();
    }
}