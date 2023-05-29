import java.util.*;
public class Vector{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);

        list.contains(65);

        list.set(0,99);

        list.remove(2);

        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('a');
        System.out.println(list1);
        
    }
}