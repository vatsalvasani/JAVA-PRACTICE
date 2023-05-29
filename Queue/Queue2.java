class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class ArrayList{
    Node Front;
    Node Rear;

    public boolean isEmpty()
    {
        return Front==null;
    }

    public void add(int i)
    {
        Node new_node = new Node(i);
        if(isEmpty())
        {
            Front = new_node;
            Rear = new_node;
        }
        Rear.next = new_node;
        Rear = Rear.next;
    }
    public int delete()
    {
        if(isEmpty())
        {
            System.out.println("STACK EMPTY");
            System.exit(0);
        }
        int x = Front.data;
        Front = Front.next;
        return x;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("STACK EMPTY");
            System.exit(0);
        }
        int x = Front.data;
        return x;
    }

}



public class Queue2{
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();
        al.add(9);
        al.add(0);
        al.add(3);
        al.delete();
        while(!al.isEmpty())
        {
            System.out.print(al.peek());
            al.delete();
        }
        
    }
}