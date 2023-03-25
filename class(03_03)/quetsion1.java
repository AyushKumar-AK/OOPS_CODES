class box {
    double dimensions(int w, int h, double d){
        return w*h*d;
    }
}

class question1{
    public static void main(String args[]){
        box s1= new box();
        double a= s1.dimensions(10, 20, 30);
        System.out.println("Volume: " + a);
    }
}
