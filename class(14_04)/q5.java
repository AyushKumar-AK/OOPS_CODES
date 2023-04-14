//nested try block

class q5{

    public static void main(String args[]) {
        try{
            try{
                System.out.println("Inside block1");
                int b =45/0;
                System.out.println(b);
            }
            catch(ArithmeticException e1){
                System.out.println("Exception: e1");
            }
        }
        catch(Exception e5){
            System.out.println("Exception");
        }
    }
}