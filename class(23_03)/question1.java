//create a interface named figure define method calculate_area and declare a varibale pi with value 3.142

interface figure
{
    final double pi=3.142;
    void calculate_area();
}

//create one more interface polygon where the area is undefined

interface polygon
{
    void calculate_area();
}

//create a class named circle which implements all the methods of figure and polygon

class circle implements figure,polygon
{
    double r;
    circle(double r)
    {
        this.r=r;
    }
    public void calculate_area()
    {
        System.out.println("Area of circle is "+(pi*r*r));
    }
}

class question1{
    public static void main(String[] args) {
        circle c=new circle(5);
        c.calculate_area();
    }
}