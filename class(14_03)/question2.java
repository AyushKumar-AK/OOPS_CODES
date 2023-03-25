class shape {

    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void erase() {
        System.out.println("Erasing a shape");
    }
    
}

class circle extends shape {

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void erase() {
        System.out.println("Erasing a circle");
    }
    
}

class triangle extends shape {

    public void draw() {
        System.out.println("Drawing a triangle");
    }

    public void erase() {
        System.out.println("Erasing a triangle");
    }
    
}

class square extends shape {

    public void draw() {
        System.out.println("Drawing a square");
    }

    public void erase() {
        System.out.println("Erasing a square");
    }
    
}

class question2 {
    public static void main(String[] args) {
        shape obj1 = new circle();
        obj1.draw();
        obj1.erase();
        shape obj2 = new triangle();
        obj2.draw();
        obj2.erase();
        shape obj3 = new square();
        obj3.draw();
        obj3.erase();
    }
}
