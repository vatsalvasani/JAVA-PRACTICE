// import java.util.*;

// class ll{
//     Node Head;
//     class Node{
//         int data;
//         Node next;
//         Node(int data)
//         {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void add(int x)
//     {
//         if(Head == null)
//         {
//             Head = new Node(x);
//             return;
//         }
//         else{
//             Node new_node = new Node(x);
//             new_node.next = Head;
//             Head = new_node;
//         }
//     }

//     public void add_last(int x)
//     {
//         if(Head == null)
//         {
//             Head = new Node(x);
//             return;
//         }
//         else{
//             Node new_node = new Node(x);
//             Node temp = Head;
//             while(temp.next!=null)
//             {
//                 temp = temp.next;
//             }
//             temp.next = new_node;
//         }
//     }

//     public void print()
//     {
//         Node temp = Head;
//         while(temp!=null)
//         {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.print("\n");
//     }

//     public void delete(int x)
//     {
//         Node temp = Head.next;
//         Node temp1 = Head;
//         if(temp1.data == x)
//         {
//             Head = Head.next;
//             return;
//         }
//         while(temp!=null && temp.data!=x)
//         {
//             temp = temp.next;
//             temp1 = temp1.next;
//         }
//         if(temp!=null)
//         {
//             temp1.next=temp.next;
//         }
//     }


// }


// public class LinkedList1{
//     public static void main(String args[])
//     {
//         ll list = new ll();
//         list.add(5);
//         list.print();
//         list.add_last(3);
//         list.print();
//         list.add_last(2);
//         list.print();
//         list.add(7);
//         list.print();


//         list.delete(3);
//         list.print();
//     }
// }






/////***************************COLLECTION FRAMEWORK*********************/
// import java.util.*;
// public class LinkedList1{
//     public static void main(String args[])
//     {
//         LinkedList<Integer> ll = new LinkedList<>();
//         ll.add(4);
//         ll.add(3);
//         ll.add(1,1);
//         ll.set(1,2);
//         ll.addFirst(0);
//         System.out.println(ll);
//         ll.removeFirst();
//         ll.removeLast();
//         System.out.println(ll);

//         Collections.min(ll);
//         Collections.sort(ll);
//         System.out.println(ll);
        
//         Collections.reverse(ll);
//         System.out.println(ll);

//     }
// }


//reverse linked list
// class ll{
//     Node Head;
//     class Node{
//         int data;
//         Node next;
//         Node(int data)
//         {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public void add(int x)
//     {
//         Node new_node = new Node(x);
//         if(Head == null)
//         {
//             Head = new_node;
//         }
//         else{
//             new_node.next = Head;
//             Head = new_node;
//         }
//     }
//     public Node reverse(Node head)
//     {
//         if(head.next==null)return head;
//         head = reverse(head.next);
//         Node temp = head;
//         while(head.next != null)
//         {
//             head = head.next;
//         }
//         head.next = Head;
//         Head.next = null;
//         Head = temp;
//         return Head;
//     }
// }
// public class LinkedList1{
//     public static void main(String args[])
//     {
//         ll l = new ll();
//         l.add(2);
//         l.add(9);
//         l.add(3);
//         System.out.print(l.reverse(l.Head).data);
//     }
// }