import java.io.IOException;

public class Excep
{
    public static void main(String[] args) throws InterruptedException {

    Thread.sleep(3000);
    System.out.println("yeah");
    try {
        int a = 100, b = 0, c;
        c = a / b;
    } catch (Exception e1) {
        System.out.println(e1);
    }
    finally
        {
            System.out.println("name");
            int l = 10 / 0;

            if (l == 10 / 0) {
                throw new ArithmeticException();
            } else {
                System.out.println("not exception");
            }
        }

    }
}
