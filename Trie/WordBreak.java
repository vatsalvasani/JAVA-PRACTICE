class Node{
    Node[] childrens;
    boolean eow;
    Node(){
        childrens = new Node[26];
        for(int i=0;i<26;i++)
        {
            childrens[i] = null;
        }
        eow = false;
    }
}
class Trie2{
    Node root = new Node();

    void insert(String str)
    {
        Node temp = root;
        for(int i=0;i<str.length();i++)
        {
            if(temp.childrens[str.charAt(i) - 'a'] == null)
            {
                temp.childrens[str.charAt(i) - 'a'] = new Node();
            }
            if(i==str.length()-1)
            {
                temp.childrens[str.charAt(i)-'a'].eow = true; 
            }
            temp = temp.childrens[str.charAt(i) - 'a'];
        }
    }

    boolean search(String str)
    {
        Node temp = root;
        for(int i=0;i<str.length();i++)
        {
            if(temp.childrens[str.charAt(i) - 'a'] == null)
            {
                return false;
            }
            if(i==str.length()-1 && temp.childrens[str.charAt(i) - 'a'].eow == false)
            {
                return false;
            }
            temp = temp.childrens[str.charAt(i) - 'a'];
        }
        return true;
    }
    boolean breakWord(String str)
    {
        if(str.length()==0)return true;
        for(int i=1;i<=str.length();i++)
        {
            String part1 = str.substring(0,i);
            String part2 = str.substring(i);
            if((search(part1))&&(breakWord(part2))){
                return true;
            }
        }
        return false;
    }
}
public class WordBreak{
    public static void main(String args[])
    {
       String[] words = {"i","like","sam","samsung","mobile","ice"};
       String key = "ilikesamsung";
       Trie2 t = new Trie2();
       for(int i=0;i<words.length;i++)
       {
            t.insert(words[i]);
       }
       System.out.print(t.breakWord(key));

    }
}