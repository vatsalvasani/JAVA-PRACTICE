// import java.util.ArrayList;
// import java.util.Collections;
// public class ArrayList1{
//     public static void main(String args[])
//     {
//         ArrayList<Integer> list = new ArrayList<>();

//         //add
//         list.add(2);
//         list.add(3);
//         list.add(6);
//         list.add(5);
//         list.add(3);
//         list.add(9);

//         //read
//         System.out.println(list.get(0));

//         //update
//         list.set(0,3);
//         System.out.println(list.get(0));
        
//         //delete
//         list.remove(1);
//         System.out.println(list.get(1));

//         //add on paticular
//         list.add(0,3);

//         //iterate
//         for(Integer i : list)
//         {
//             System.out.print(i + " ");
//         }

//         //sort
//         Collections.sort(list);
//         for(Integer i:list)
//         {
//             System.out.print(i + " ");
//         }

//         //reverse sort
//         Collections.sort(list,Collections.reverseOrder());
//         System.out.print("\n");
//         for(Integer i : list)
//         {
//             System.out.print(i + " ");
//         }

//         //Min Or Max Value
//         System.out.println(Collections.min(list));
//         System.out.println(Collections.max(list));

//         //upper and lower bound
//         Collections.sort(list);

//         int index = Collections.binarySearch(list,4);
//         System.out.print(Math.abs(index));

//     }
// }

import java.util.*;
public class ArrayList1{
    public static void main(String args[])
    {
        ArrayList1<Integer> list = new ArrayList1<>();

        //add
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        //read
        System.out.print(list.get(0));

        //update
        list.set(0,3);
        for(Integer i:list)
        {
            System.out.print(i);
        }

        //delete
        list.remove(0);
        for(Integer i : list)
        {
            System.out.print(i);
        }

        //add at particular
        list.add(0,4);
        for(Integer i : list)
        {
            System.out.print(i);
        }

        //sort
        Collections.sort(list);
        
        //reverseorder
        Collections.sort(list,Collections.reverseOrder());

        //reverse
        Collections.reverse(list);

        //min and max
        int c = Collections.min(list);
        int d = Collections.max(list);

        //upper and lower
        int index = Collections.binarySearch(list,9);        
    }
}






















