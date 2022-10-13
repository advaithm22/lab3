import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void testMerge(){
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("d");
        list2.add("e");
        List<String> newList = ListExamples.merge(list1, list2);
        assertEquals("[a, a, b, c, d, e]", newList.toString());
;    }
}
