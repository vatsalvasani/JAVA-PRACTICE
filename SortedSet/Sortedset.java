import java.util.*;
public class Sortedset{
    public static void main(String args[])
    {
        SortedSet<String> ss = new TreeSet<>();
        ss.add("A");
        ss.add("S");
        ss.add("S");
        ss.add("d");
        ss.add("e");

        ss.remove("A");
        System.out.print(ss);

        System.out.print(ss.first());

        Iterator it = ss.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next());

        }
    }
}