//get
//set
//update
//delete

import java.util.*;
public class BitManipulation{

    public static int delete(int x,int y)
    {
        int b = (~1)<<(y-1);
        return (x & b);
    }

    public static int set(int x,int y)
    {
        int b = 1<<(y-1);
        return (x|b);
    }


    public static int get(int x,int y)
    {
        int b = 1<<(y-1);
        if((x & b) == 0)return 0;
        else{
            return 1;
        }

    }

    public static int update(int x,int y,int z)
    {
        if(z==0)
        {
            return delete(x,y);
        }
        else{
            return set(x,y);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int get_ans = get(x,y);
        System.out.println(get_ans);

        int set_ans = set(x,y);
        System.out.println(set_ans);

        int del_ans = delete(x,y);
        System.out.println(del_ans);

        int z = sc.nextInt();
        int upd_ans = update(x,y,z);
        System.out.println(upd_ans);
    }
}