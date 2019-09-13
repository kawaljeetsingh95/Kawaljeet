public class Demo_employee
{
    public static void main(String[] args)
    {
       Employee e=new Employee();
       e.setAge(23);
       e.setEmp_id(101);
       e.setName("kawaljeet");
       e.setSalary(20000);
       System.out.println("employee age:"+e.getAge());
       System.out.println("employee name:"+e.getName());
       System.out.println("employee salary:"+e.getSalary());
       System.out.println("empployee id:"+e.getEmp_id());
    }
}
