abstract class Abstraction {
    int a = 10;
    int b = 20;

    abstract void rectangle();

    abstract void square();

    void demo() {
        System.out.println("find area of rectangle and square");
    }
}
abstract class Area1 extends Abstraction
{
    abstract void square();
    void rectangle()
    {
        System.out.println("area of rectangle:"+a*b);
    }

}
  class Area2 extends Area1
{
    void square()
    {
        System.out.println("area of square:"+a*a);
    }

}


