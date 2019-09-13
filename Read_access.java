public class Read_access
{
    private int age=10;
    public  int getAge()
    {
        return age;
    }

    public static void main(String[] args)
    {
      Read_access d=new Read_access();
      System.out.println(d.getAge());
    }

}
