public class Team_QA
{
    String name;
    int age;
    String gender;
    String designation;
    String project_name;
    public static void main(String[] args)
    {
        Team_QA obj=new Team_QA();
        obj.name="kawaljeet_singh";
        obj.age=23;
        obj.gender="male";
        obj.designation="Quality_Analyst";
        obj.project_name="Manual_Testing";
        System.out.println("the employee details is :"+obj.name+" "+obj.age+" "+obj.gender+" "+obj.designation+""+obj.project_name);
    }
}
