import java.util.*;
class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
class binaryTree{
    int i = -1;
    // public Node BuidTree(int[] arr)
    // {
    //     i++;
    //     if(arr[i]==-1)
    //     {
    //         return null;
    //     }
    //     Node new_node = new Node(arr[i]);
    //     new_node.left = BuidTree(arr);
    //     new_node.right = BuidTree(arr);
    //     return new_node;
    // }

    public Node BuidTree(int[] arr)
    {
        i++;
        if(arr[i]==-1){
            return null;
        }
        Node new_node = new Node(arr[i]);
        new_node.left = BuidTree(arr);
        new_node.right = BuidTree(arr);
        return new_node;
    }

    public void printPreorder(Node root)
    {
        if(root == null)return;
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public void printPostorder(Node root)
    {
        if(root == null)return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data + " ");

    }

    public void printInorder(Node root)
    {
        if(root == null)return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public void printLevelorder(Node root)
    {
        // if(root == null)return;
        // Queue<Node> q = new LinkedList<>();
        // q.add(root);
        // q.add(null);
        // while(!q.isEmpty())
        // {
        //     Node x = q.peek();
        //     q.remove();
        //     if(x==null)
        //     {
        //         System.out.print("\n");
        //         if(q.isEmpty()){
        //             break;
        //         }
        //         else{
        //             q.add(null);
        //         }
                
        //     }
        //     else{
        //         System.out.print(x.data);
            
        //     if(x.left != null)
        //     {
        //         q.add(x.left);
        //     }
            
        //     if(x.right != null)
        //     {
        //         q.add(x.right);
        //     }
        //     }
        // }
        if(root == null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node n = q.peek();
            q.remove();
            if(n==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(n.data);
                if(n.left!=null)
                {
                    q.add(n.left);
                }
                if(n.right!=null)
                {
                    q.add(n.right);
                }
            }
        }
    }
    public int countNoOfNodes(Node n)
    {
        if(n == null)return 0;
        return countNoOfNodes(n.left)+countNoOfNodes(n.right)+1;
    }

    public int countSumOfNodes(Node n)
    {
        if(n==null)return 0;
        return countSumOfNodes(n.left)+countSumOfNodes(n.right)+n.data;
    }
    public int depthOfTree(Node root)
    {
        if(root==null)return 0;
        return Math.max(depthOfTree(root.left),depthOfTree(root.right))+1;
    }
    public int diameterOfTree(Node root)
    {
        if(root==null)return 0;
        int diam1 = diameterOfTree(root.left);
        int diam2 = diameterOfTree(root.right);
        int diam3 = depthOfTree(root.left)+depthOfTree(root.right)+1;
        return Math.max(Math.max(diam1,diam2),diam3);
    }

    class TreeInfo{
        int height;
        int diam;
        TreeInfo(int height,int diam)
        {
            this.height = height;
            this.diam  = diam;
        }
    }
    public TreeInfo diameterOfTree2(Node root)
    {
        if(root==null)return new TreeInfo(0,0);

        TreeInfo left_info = diameterOfTree2(root.left);
        TreeInfo right_info = diameterOfTree2(root.right);

        int MyHeight = Math.max(left_info.height,right_info.height)+1;

        int MyDiam = Math.max(Math.max(left_info.diam,right_info.diam),left_info.height+right_info.height+1);

        TreeInfo MyInfo = new TreeInfo(MyHeight,MyDiam);
        return MyInfo;
    }
}

public class BinaryTree1{
    public static void main(String args[])
    {
        binaryTree bt = new binaryTree();
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Scanner sc = new Scanner(System.in);
        
        Node n = bt.BuidTree(arr);
        System.out.print(n.data);

        bt.printPreorder(n);
        System.out.print("\n");
        bt.printInorder(n);
        System.out.print("\n");
        bt.printPostorder(n);

        System.out.print("\n");
        bt.printLevelorder(n);

        System.out.print("\n");
        System.out.print(bt.countNoOfNodes(n));

        System.out.print("\n");
        System.out.print(bt.countSumOfNodes(n));

        System.out.print("\n");
        System.out.print(bt.depthOfTree(n));

        //order of n^2
        System.out.print("\n");
        System.out.print(bt.diameterOfTree(n));

        //order of n
        System.out.print("\n");
        System.out.print(bt.diameterOfTree2(n).diam);
    }
}