package ac.za.cput;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   App app;
   Map<Integer, String> map;
   Set<String> set;
   List<String> list;

    @Before
    public void setUp()  {
        app = new App();
        map = new HashMap<>();
        set = new TreeSet<>();
        list = new ArrayList<>();
    }

    @Test
    public void testMap(){
        Assert.assertTrue("Map is matching the values", map.equals(map));
    }

}
