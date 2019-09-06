public class Person
{
    int age;
    String name;
    Person(int a,String b)
    {
        age=a;
        name=b;
    }
    public static void main(String[] args)
    {
        Person obj=new Person(27,"kawal");
        int d=100-obj.age;
        System.out.println("square of an age:"+(d*d));
    }
}
