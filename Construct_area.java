public class Construct_area {
    double length;
    double height;
    double area;

    Construct_area() {
        length = 10;
        height = 20;
        area = length * height;
        System.out.println("area of rectangle:" + area);
    }

    public static void main(String[] args) {
        Construct_area a = new Construct_area();
    }
}


