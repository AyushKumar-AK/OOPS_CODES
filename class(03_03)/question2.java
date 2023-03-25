import java.lang.Math;
class calculator {
    static int powerInt(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
    static int powerDouble(double num1, int num2){
        return (int) Math.pow(num1,num2);
    }    
}

class solve{
    public static void main (String args[]){
        System.out.println("For two inetegers: "+ calculator.powerInt(10, 2));
        System.out.println("For one double and one integer: "+ calculator.powerDouble(10, 2));
    }
}
