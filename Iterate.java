import java.util.*;

public class Iterate {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("kawal");
        list.add("arjun");
        //Traversing list through Iterator
       // Iterator itr =  list.iterator();
       // while (itr.hasNext()) {
         //   System.out.println(itr.next());
        //Traverse through for each loop
      //  for(String obj:list)
          //  System.out.println(obj);
        //Traveverse through list iterator
       // ListIterator<String> list1=list.listIterator(list.size());
      //  while(list1.hasPrevious())
        //{
          //  String str=list1.previous();
            //System.out.println(str);
        //Traverse through for loop
      //  for(int i=0;i<list.size();i++)
        //{
          //  System.out.println(list.get(i));
        //}
       // list.forEach(a->{ //Here, we are using lambda expression
         //   System.out.println(a);
        //});
        //for each remaining
       // Iterator<String> itr=list.iterator();
       // itr.forEachRemaining(a-> //Here, we are using lambda expression
       // {
         //   System.out.println(a);
        //});
        // Creating an empty Map
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();

        // Mapping string values to int keys
        map1.put(10, "Geeks");
        map1.put(15, "4");
        map1.put(20, "Geeks");
        map1.put(25, "Welcomes");
        map1.put(30, "You");

        // Mapping string values to int keys
        map2.put(10, "Geeks");
        map2.put(15, "4");
        map2.put(20, "Geeks");
        map2.put(25, "kawal");
        map2.put(30, "You");

        // Displaying the Map1
        System.out.println("First Map: "
                + map1);

        // Displaying the Map2
        System.out.println("Second Map: "
                + map2);

        // Checking the equality
        System.out.println("Equality: " + map1.equals(map2));
    }
    }

