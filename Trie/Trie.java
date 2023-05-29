class Node{
    Node[] childrens;
    boolean eow;
    Node()
    {
        childrens = new Node[26];
        for(int i=0;i<26;i++)
        {
            childrens[i] = null;
        }
        eow = false;
    }
}
class trie1{
    Node root = new Node();
    public void insert(String str)
    {
        Node curr = root;
        for(int i=0;i<str.length();i++)
        {
            
            if(curr.childrens[(str.charAt(i)) - 'a'] == null)
            {
                Node new_node = new Node();
                curr.childrens[(str.charAt(i)) - 'a'] = new_node;
            }
        
            if(i==str.length()-1){
                curr.childrens[(str.charAt(i)) - 'a'] .eow = true;
            }
            curr = curr.childrens[str.charAt(i) - 'a'];
        }
    }

    public boolean search(String str)
    {
        Node curr = root;
        for(int i=0;i<str.length();i++)
        {
            if(curr.childrens[str.charAt(i) - 'a']==null)
            {
                return false;
            }
            if(i==(str.length()-1) && curr.childrens[str.charAt(i) - 'a'].eow==false)
           {
            return false;
           }  
            curr = curr.childrens[str.charAt(i) - 'a'];
        }
        
        return true;
    }
}
public class Trie{
    public static void main(String args[])
    {
        String[] arr = {"the","a","their","there"};
        trie1 t = new trie1();
        for(int i=0;i<arr.length;i++)
        {
            t.insert(arr[i]);
        }
        System.out.print(t.search("their")); 
        System.out.print(t.search("th")); 
    }
}
