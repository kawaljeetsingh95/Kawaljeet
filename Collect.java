import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collect
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("kawal");
        list.add("rubal");
        list.add("aman");
        list.add("rita");
        System.out.println(list);



        //List<String> list1 = new ArrayList<>();
        //list1.add("dog");
        //list1.add("cat");
        //list1.add("kawal");
        //System.out.println(list1);

        //list.addAll(list1);
        //System.out.println("LIST AFTER ADDING"+list);



        //List<String> list2 = new ArrayList<>();
        //list2.add("rubal");
        //list2.add("kawaljeet");
        //System.out.println("The content is equals:"+list.containsAll(list2));
        //if(list.equals(list1))
        //{
          //  System.out.println("equals");
        //}
        //else
        //{
         //   System.out.println("not equals");
       //}
        //Iterator iterator = list.iterator();
        //System.out.println("List elements:");



        //boolean changed = list.removeAll(list1);
        //if (changed)
            //System.out.println("Collection removed");
        //else
          //  System.out.println("Collection not removed");

        //System.out.println(list);


        //list.replaceAll(String::toUpperCase);
        //System.out.println(list);


        //list1.retainAll(list);
        //System.out.println("List one"+list1);
       // System.out.println("List only"+list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
