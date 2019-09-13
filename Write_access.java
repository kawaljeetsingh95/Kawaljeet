public class Write_access
{
    private int age;
    public void setAge(int age)
    {
        this.age=age;
    }
    public static void main(String[] args)
    {
        Write_access d=new Write_access();
        d.setAge(20);
        System.out.println("20");
    }

}
