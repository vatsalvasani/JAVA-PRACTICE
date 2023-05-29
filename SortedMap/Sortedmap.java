import java.util.*;
public class Sortedmap{
    public static void main(String[] args)
    {
        SortedMap<Integer,String> sm = new TreeMap<>();
        sm.put(2,"HI");
        sm.put(1,"HELLO");
        sm.put(3,"VATSAL");
        sm.put(2,"VASANI");    

        sm.remove(1);
        String s = sm.get(1);  
        if(sm.containsKey(1)){
            System.out.print("True");
        }      
        if(sm.containsValue("HI"))
        {
            System.out.print("True");
        }

        SortedMap<Integer,String> sm1 = sm.subMap(2,3);
        SortedMap<Integer,String> sm2 = sm.tailMap(3);

        for(Map.Entry<Integer,String> e:sm1.entrySet())
        {
            System.out.print(e.getKey());
            System.out.print(e.getValue());
        }
        for(Map.Entry<Integer,String> e : sm2.entrySet())
        {
            System.out.print(e.getKey());
            System.out.print(e.getValue());
            
        }
         

        for(Map.Entry<Integer,String> e : sm.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            
        }


    }
}
