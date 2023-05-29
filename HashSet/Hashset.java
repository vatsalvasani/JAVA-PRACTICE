// import java.util.*;
// public class Hashset{
//     public static void main(String args[])
//     {
//         HashSet<Integer> hs = new HashSet<>();
//         hs.add(1);
//         hs.add(2);
//         hs.add(3);
//         hs.add(4);
//         hs.add(5);
//         System.out.println(hs.contains(1));
//         hs.remove(1);
//         System.out.println(hs.contains(1));

//         Iterator it = hs.iterator();
//         while(it.hasNext())
//         {
//             System.out.print(it.next());
//         }
//     }
// }

import java.util.*;
public class Hashset
{
    public static void main(String args[])
    {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(0);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(0);
        hs.add(4);
        hs.add(5);
        hs.add(16);

        System.out.print(hs);
        hs.remove(1);
        if(hs.contains(0))
        {
            System.out.print("TRUE");
        }

        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next());
        }
        
    }
}