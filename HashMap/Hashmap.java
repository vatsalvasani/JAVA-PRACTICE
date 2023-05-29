import java.util.*;
public class Hashmap{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"abc");
        hm.put(3,"bc");
        hm.put(2,"c");
        hm.put(4,"a");
        hm.put(5,"b");

        if(hm.containsKey(3))
        {
            System.out.println("TRUE");
        }
        if(hm.containsValue("bc"))
        {
            System.out.println("False");
        }

        hm.remove(3);
        String s = hm.get(2);
        System.out.print(s);
        for(Map.Entry<Integer,String> a : hm.entrySet())
        {
            System.out.print(a.getKey());
            System.out.print(a.getValue());
        }

    }
}