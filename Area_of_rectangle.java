 class Area_of_rectangle
{
    double l;
    double h;
    double area;
    public void show()
    {
        area=l*h;
    }
    public static void main(String[] args )
    {
        Area_of_rectangle obj=new Area_of_rectangle();
        obj.l=20;
        obj.h=10;
        obj.show();
        System.out.println("area of rectangle :"+obj.area);
    }
}

