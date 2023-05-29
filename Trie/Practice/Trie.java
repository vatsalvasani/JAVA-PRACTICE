class Node{
    Node[] childrens;
    boolean eow;
    Node(){
        childrens = new Node[26];
        eow = false;
    }

}
class Trie1{
    Node root;
    Trie1(){
        root = new Node();
    }
    public void insert(String str)
    {
        Node temp = root;
        for(int i = 0;i<str.length();i++)
        {
            if(temp.childrens[str.charAt(i) - 'a'] == null)
            {
                Node new_node = new Node();
                temp.childrens[str.charAt(i)-'a'] = new_node;

            }
            if(i == str.length()-1 && temp.childrens[str.charAt(i)-'a'].eow==false)
            {
                temp.childrens[str.charAt(i)-'a'].eow = true;
            }
            temp = temp.childrens[str.charAt(i)-'a'];
        }
    }

    public boolean search(String str)
    {
        Node temp = root;
        for(int i=0;i<str.length();i++)
        {
            if(temp.childrens[str.charAt(i)-'a'] == null)
            {
                return false;
            }
            if(i==str.length()-1 && temp.childrens[str.charAt(i)-'a'].eow == false)
            {
                return false;
            }
            temp = temp.childrens[str.charAt(i)-'a'];

        }
        return true;
    }
    public boolean wordBreak(String str)
    {
        if(str.length()==0)return true;
        for(int i=1;i<=str.length();i++)
        {
            String part1 = str.substring(0,i);
            String part2 = str.substring(i);

            if(search(part1) && wordBreak(part2))return true;
        }
        return false;

    }

    boolean startsWith(String str)
    {
        Node temp = root;
        for(int i=0;i<str.length();i++)
        {
            if(temp.childrens[str.charAt(i) - 'a'] == null)
            {
                return false;
            }
            temp = temp.childrens[str.charAt(i) - 'a'];
        }
        return true;
    }
    String[] suffix(String str)
    {
        int n = str.length();
        String[] suffix = new String[str.length()];
        for(int i = 0;i<str.length();i++)
        {
            suffix[i] = str.substring(i,n);
        }
        return suffix;
    }
    int insert1(String str)
    {
        Node temp = root;
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(temp.childrens[str.charAt(i) - 'a'] == null)
            {
                temp.childrens[str.charAt(i) - 'a'] = new Node();
                count +=1;
            }
            if(i == str.length()-1 && temp.childrens[str.charAt(i) - 'a'].eow == false)
            {
                temp.childrens[str.charAt(i) - 'a'].eow = true;
            }
            temp =temp.childrens[str.charAt(i) - 'a'];
        }
        return count;
    }
    int uniqueSubstring(String str)
    {
        String[] suffix = suffix(str);
        int count = 1;
        for(int i=0;i<suffix.length;i++)
        {
            int x = insert1(suffix[i]);
            count = count + x;
        }
        return count;
    }

    String ans = "";
    void longestWord(Node node,StringBuilder temp)
    {
        if(node==null)return;
        for(int i=0;i<26;i++)
        {
            if(node.childrens[i]!=null && node.childrens[i].eow==true)
            {
                temp.append((char)(i+'a'));
                if(temp.length()>=ans.length())
                {
                    ans = temp.toString();
                }
                longestWord(node.childrens[i],temp);
                System.out.println(temp);
                temp.deleteCharAt(temp.length()-1);
                System.out.println(temp);

            }
        }
    }

}

public class Trie{
    public static void main(String args[])
    {
        String[] arr = {"a","ap","app","apple","appl","mango","man","m","woman"};
        Trie1 t = new Trie1();
        for(int i=0;i<arr.length;i++)
        {
            t.insert(arr[i]);
        }
        System.out.print(t.search("their")); 
        System.out.print(t.search("th")); 

        System.out.print(t.wordBreak("theaheir"));

        System.out.print(t.startsWith("appl"));

        Trie1 t2 = new Trie1();

        System.out.print(t2.uniqueSubstring("abab"));

        System.out.println();
        t.longestWord(t.root,new StringBuilder(""));
        System.out.print(t.ans);

        
    }
}