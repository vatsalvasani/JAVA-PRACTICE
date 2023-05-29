import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
class Tree{
    // public Node BuildTree(Node root,int val)
    // {
    //     if(root==null)
    //     {
    //         root = new Node(val);
    //         return root;
    //     }
    //     if(val<root.data)
    //     {
    //         root.left = BuildTree(root.left,val);
    //     }
    //     else{
    //         root.right = BuildTree(root.right,val);
    //     }
    //     return root;
    // }


    public Node BuildTree(Node root,int val)
    {
        if(root==null)
        {
            root = new Node(val);
            return root;   
        }
        if(val<root.data)
        {
            root.left = BuildTree(root.left,val);
        }
        else{
            root.right = BuildTree(root.right,val);
        }
        return root;
    }

    public void printInorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public boolean search(Node root,int val)
    {
        if(root==null)return false;
        if(root.data == val)return true;
        if(val<root.data)
        {
            return search(root.left,val);
        }
        else
        {
            return search(root.right,val);
        }
    }

    // public Node delete(Node root,int val)
    // {
    //     if(val<root.data)
    //     {
    //         root.left = delete(root.left,val);
    //     }
        
    //     if(val>root.data)
    //     {
    //         root.right = delete(root.right,val);
    //     }

    //     if(root.left == null && root.right == null)
    //     {
    //         return null;
    //     }
    //     if(root.left==null)
    //     {
    //         return root.right;
    //     }
    //     else if(root.right == null)
    //     {
    //         return root.left;
    //     }
    //     Node Ios = findInoredeSuccessor(root.right);
    //     root.data = Ios.data;
    //     root.right = delete(root.right,Ios.data);
    //     return root;
        

    // }

    public Node delete(Node root,int val)
    {
        if(val<root.data)
        {
            root.left = delete(root.left,val);
        }
        else if(val>root.data){
            root.right = delete(root.right,val);
        }
        if(root.left==null && root.right == null){
            return null;
        }
        if(root.left==null)
        {
            return root.right;
        }
        else if(root.right==null)
        {
            return root.left;
        }
        Node Ios = findInoredeSuccessor(root.right);
        root.data = Ios.data;
        root.right = delete(root.right,Ios.data);
        return root;
    }

    public Node findInoredeSuccessor(Node root)
    {
        if(root.left==null)
        {
            return root;
        }
        return findInoredeSuccessor(root.left);
    }


    public void printBetweenRange(Node root,int x,int y)
    {
        if(root==null){return;}
        if(root.data>=x && root.data<=y)
        {
            printBetweenRange(root.left,x,y);
            System.out.print(root.data);
            printBetweenRange(root.right,x,y);
        }
        else if(root.data<x)
        {
            printBetweenRange(root.right,x,y);
        }
        else{
            printBetweenRange(root.left,x,y);
        }
    }

    public void printRoot2path(Node root,ArrayList<Integer> path)
    {
        if(root==null)
        {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right==null)
        {
            //print path
            for(int i =0;i<path.size();i++)
            {
                System.out.print((path.get(i)) + "->");
            }
            System.out.println();
        }else{
            System.out.print((root.data));
            System.out.print(path);
            printRoot2path(root.left,path);
            printRoot2path(root.right,path);
        }
        System.out.print((root.data));
        System.out.print(path);
        System.out.println();
        // path.remove(path.size()-1);
        System.out.print((root.data));
        System.out.print(path);
    }
   
}


public class BinarySearchTree{
    public static void main(String args[])
    {
        int[] arr = {5,4,3,2,7};
        Node root = null;
        Tree t = new Tree();
        for(int i=0;i<arr.length;i++)
        {
            root=t.BuildTree(root,arr[i]);
        }
        System.out.println(root.data);
        t.printInorder(root);

        System.out.println();
        System.out.print(t.search(root,8));

        System.out.println();
        // root = t.delete(root,5);
        t.printInorder(root);

        System.out.println();
        t.printBetweenRange(root,2,7);

        System.out.println();
        ArrayList<Integer> arr1 = new ArrayList<>();
        t.printRoot2path(root,arr1);


    }
}