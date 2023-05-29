import java.util.*;
public class Queue1{
    public static void main(String args[])
    {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(2);
        q1.add(2);
        q1.add(2);
        
        q1.remove();
        while(!q1.isEmpty())
        {
            System.out.print(q1.peek() + " ");
            q1.remove();
        }

    }
}