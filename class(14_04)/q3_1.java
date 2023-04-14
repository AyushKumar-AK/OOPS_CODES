
class q3_1{
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
    }
}



