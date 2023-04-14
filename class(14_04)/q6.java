//can we have same catch block to catch exception from nested try block

class q6{
    public static void main(String args[]) {
        try{
            try{
                System.out.println("Inside block1");
                int b =45/0;
                System.out.println(b);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}