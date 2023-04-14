
class q4_2{
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
        catch(Exception e){
            System.out.println("Exception");
        }
        finally{
            System.out.println("Finally block");
        }
        
        
    }
}



