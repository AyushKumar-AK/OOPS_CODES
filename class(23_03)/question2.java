interface fruits{
    void taste();
}

interface sweetfruits extends fruits{
    void color();
}

class redfruits implements sweetfruits{
    public void taste(){
        System.out.println("Taste is Sweet");
    }
    public void color(){
        System.out.println("Color is Red");
    }
}

class question2{
    public static void main(String[] args) {
        redfruits r=new redfruits();
        r.taste();
        r.color();
    }
}