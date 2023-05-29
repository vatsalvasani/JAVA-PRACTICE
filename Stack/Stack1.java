import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x)
    {
        this.data = x;
        this.next = null;
    }
}
class stack{
    Node Top;

    public boolean isEmpty()
    {
        return Top==null;
    }

    public void push(int x)
    {
        Node new_node = new Node(x);
        if(isEmpty())
        {
            Top = new_node;
            return;
        }
        Node temp = Top;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = null;
    }

    public int pop()
    {
        Node temp = Top;
        if(isEmpty())
        {
            return -1;
        }
        if(temp.next == null)
        {
            Top = null;
            return temp.data;
        }
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return temp.data;
    }

    public int peek()
    {
        Node temp = Top;
        if(isEmpty())
        {
            return -1;
        }
        if(temp.next == null)
        {
            return temp.data;
        }
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        return temp.data;
    }

}


public class Stack1{
    public static void main(String args[])
    {
        Stack sc = new Stack();
        sc.push(1);
        sc.push(10);
        sc.push(12);
        sc.push(15);
        sc.push(14);

        // sc.pop();

        while(!sc.isEmpty())
        {
            System.out.print(sc.peek() + " ");
            sc.pop();
        }


    }
}