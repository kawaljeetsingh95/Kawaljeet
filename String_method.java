import java.util.stream.IntStream;

public class String_method
{
    public static void main(String[] args)
    {
       // String myStr = "Hello";
       // int result = myStr.codePointAt(1);
      //  System.out.println(result);

       // String str = "JAVA";
       // System.out.println("String = " + str);

        // codepoint before index 1 i.e J
       // int retval = str.codePointBefore(3);

        // prints character before index1 in string
       // System.out.println("Character(unicode point) = " + retval);


      //  System.out.println();
       // String str = "w3rsource.com";
       // System.out.println("Original String : " +str);

        // codepoint from index 1 to index 10
       // int ctr = str.codePointCount(5, 10);

        // prints character from index 1 to index 10
      //  System.out.println("Codepoint count = " +ctr);
       // System.out.println();


        // String to be converted
      //  String str = "GeeksForGeeks";

        // Convert the string to code values
        // using codePoints() method
       // IntStream stream = str.codePoints();

       // System.out.println("ASCII Values are: ");

        // Print the code points
      //  stream.forEach(System.out::println);

        String str = "Welcome to string handling tutorial";
        //This will return the first char of the string
        char ch1 = str.charAt(0);

        //This will return the 6th char of the string
        char ch2 = str.charAt(5);

        //This will return the 12th char of the string
        char ch3 = str.charAt(11);

        //This will return the 21st char of the string
        char ch4 = str.charAt(20);

        System.out.println("Character at 0 index is: "+ch1);
        System.out.println("Character at 5th index is: "+ch2);
        System.out.println("Character at 11th index is: "+ch3);
        System.out.println("Character at 20th index is: "+ch4);

    }
}
