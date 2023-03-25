//abstract example

abstract class Shape
{
    abstract void draw();
}
class rect extends Shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class shapetester
{
    public static void main(String[] args)
    {
        Shape s = new rect();
        s.draw();
    }
}