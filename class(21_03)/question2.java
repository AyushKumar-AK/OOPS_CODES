abstract class car{
    abstract void start();
    abstract void stop();
    abstract void body();
}

class tata extends car{
    void start(){
        System.out.println("Tata's car started");
    }

    void stop(){
        System.out.println("Tata's car stopped");
    }

    void body(){
        System.out.println("Tata's car body");
    }
}

class testquestion2{
    public static void main(String args[]){
        tata t = new tata();

        t.start();
        t.stop();
        t.body();
    }
}