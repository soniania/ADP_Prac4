package ac.za.cput;


import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println( "Hello World!" );



        Map<Integer, String> map = new  HashMap<Integer, String>();
        map.put(1, "Sonia");
        map.put(2, "Masa");
        map.put(3, "Lala");
        map.put(4, "Zane");

        System.out.println("Map values: ");
        System.out.println(map);

        Set<String> tree_Set = new TreeSet<String>(map.values());
        System.out.println("Set values");
        System.out.println(tree_Set);

        List <String> names = new ArrayList();
        Collection<String> stringCollection = Collections.unmodifiableCollection(map.values());
       // Collection<String> stringCollection = Collections.sort(names);
        names.addAll(stringCollection);

        System.out.println("Names: ");
        System.out.println(names);



    }
}
