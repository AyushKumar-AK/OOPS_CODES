//one try one catch one finally

class q3_4{
    public static void main(String args[]) {
        int x=0;
        int y=5;
        try{
            int z=y/x;
            System.out.println(z);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        finally{
            System.out.println("Finally block");
        }
        
        
    }
}


