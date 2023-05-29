
//Find All Possible Solution And Take One Which Is Useful from All
//permutation
import java.util.*;
public class Backtracking{
    public static void permutation(String s,String ans,HashSet<String> hs)
    {
        if(s.length()==0)
        {
            if(hs.contains(ans))
            {
                return;
            }
            else{
                hs.add(ans);
                System.out.println(ans);
                return;
            }
            
        }
        for(int i=0;i<s.length();i++)
        {
            permutation(s.substring(0,i) + s.substring(i+1,s.length()),ans+s.charAt(i),hs);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> hs = new HashSet<>();
        permutation(s,"",hs);


    }
}

