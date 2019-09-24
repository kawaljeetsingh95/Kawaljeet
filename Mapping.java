import java.util.*;
import java.util.function.BiFunction;

public class Mapping {
    public static void main(String[] args) {
        Map<String, String> gfg = new HashMap<String, String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using for-each loop for iteration over Map.entrySet()
        //for (Map.Entry<String,String> entry : gfg.entrySet())
        //  System.out.println("Key = " + entry.getKey() +
        //        ", Value = " + entry.getValue());
        // gfg.replaceAll((key,val)-> val.concat("smith"));
        // System.out.println(gfg);


        // HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        //  hash_map.put(10, "Geeks");
        // hash_map.put(15, "4");
        // hash_map.put(20, "Geeks");
        // hash_map.put(25, "Welcomes");
        // hash_map.put(30, "You");

        // Displaying the HashMap
        // System.out.println("Initial Mappings are: " + hash_map);

        // Using values() to get the set view of values
        // System.out.println("The collection is: " + hash_map.values());

       // Hashtable<Integer, String> hash_table =
         //       new Hashtable<Integer, String>();

        // Inserting elements into the table
       // hash_table.put(10, "Geeks");
       // hash_table.put(15, "4");
       // hash_table.put(20, "Geeks");
       // hash_table.put(25, "Welcomes");
       // hash_table.put(30, "You");

        // Displaying the Hashtable
       // System.out.println("The Table is: " + hash_table);

        // Creating an empty enumeration to store
       // Enumeration enu = hash_table.elements();

       // System.out.println("The enumeration of values are:");

        // Displaying the Enumeration
       // while (enu.hasMoreElements()) {
        //    System.out.println(enu.nextElement());

            StringJoiner str1 = new StringJoiner(" ");

            // Adding elements in the StringJoiner
            str1.add("Geeks");
            str1.add("for");
            str1.add("Geeks");

            // Print the StringJoiner
            System.out.println("StringJoiner 1: "
                    + str1.toString());

            // Creating the second StringJoiner
            StringJoiner str2 = new StringJoiner(" ");

            str2.add("A");
            str2.add("Computer");
            str2.add("Portal");

            // Print the second StringJoiner
            System.out.println("StringJoiner 2: "
                    + str2.toString());

            // Merging the StringJoiner using merge()
            StringJoiner str = str1.merge(str2);

            // Printing the merged StringJoiner
            System.out.println("Merged StringJoiner : "
                    + str);

        }
    }








