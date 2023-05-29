import java.util.*;
class queue{
    Stack<Integer> sc1 = new Stack<>();
    Stack<Integer> sc2 = new Stack<>();

    public boolean isEmpty(){
        return sc1.isEmpty();
    }

    public void add(int y){
        while(!sc1.isEmpty())
        {
            int x = sc1.peek();
            sc1.pop();
            sc2.push(x);
        }
        sc1.push(y);
        while(!sc2.isEmpty())
        {
            int x = sc2.peek();
            sc2.pop();
            sc1.push(x);
        }
    }

    public int remove(){
        int x = sc1.peek();
        sc1.pop();
        return x;
    }
    public int peek(){
        return sc1.peek();
    }


}





public class Queue3{
    public static void main(String args[])
    {
        queue q = new queue();
        q.add(1);
        q.remove();
        q.add(2);
        q.add(1);
        q.remove();
        q.remove();
        q.add(3);
        q.add(5);
        q.remove();
        q.add(4);
        while(!q.isEmpty())
        {
            System.out.print(q.peek());
            q.remove();
        }
    }
}