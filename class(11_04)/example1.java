class example{
    public static void main(String args[]) {
        // int x=5, y=0;
        try{
            //ArithmeticException
            // System.out.println(x/y);

            // //NullPointerException
            // String s = null;
            // System.out.println(s.length());

            //NumberFormatException
            int z = Integer.parseInt("abc");

        }
        catch(ArithmeticException E){
            System.out.println("Exception Occured");
        }
        catch(NullPointerException E){
            System.out.println("Null Pointer Exception");
        }
        catch(NumberFormatException E){
            System.out.println("Number Format Exception");
        }

        finally{
            System.out.println("Stop it get some help");
        }

        System.out.println(
            "This is the end of the program"
        );

    }
}