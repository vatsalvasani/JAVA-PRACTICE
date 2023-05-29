// import java.util.*;
// public class String1{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         System.out.println("Your Name Is " + s1);


//         // CONCATENATION

//         System.out.println(s1+"BHARATBHAI");

//         //length
//         System.out.println(s1.length());

//         //print char 
//         for(int i=0;i<s1.length();i++)
//         {
//             System.out.println(s1.charAt(i));
//         }

//         //compare string
//         //if s1 > s2 return +ve value
//         //if s1 == s2 return 0
//         //if s1 < s2 return -ve value

//         String s2 = "HI";
//         if(s1.compareTo(s2)==0)
//         {
//             System.out.println("SAME");
//         }
//         else{
//             System.out.println("NOT SAME");
//         }


//         //substring
//         String s3 = s1.substring(2,3);
//                 s3 = "hi";

//         System.out.println(s3);

//         //convert string into integer
//         int num1 = Integer.parseInt("123");
//         System.out.println(num1+1);


//         //convery number into string
//         String s4 = Integer.toString(123);
//         System.out.println(s4+"vatsal");
//     }
// }


import java.util.*;
public class String1{
    public static void main(String args[])
    {
        String s1 = "VATSAL";
        String s2 = s1.substring(0,2);
        String s3 = s1.substring(0,0);
        String s4 = s1.substring(6);
        System.out.println(s3);
        System.out.println(s4);
        if(s1.compareTo(s2) == 0)
        {
            System.out.print("YES");
        }
        
        int d = Integer.parseInt("125600");
        System.out.println(d);
        String e = Integer.toString(12506);
        System.out.println(e);
    }
}


// import java.util.*;
// public class String1{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         StringBuilder str = new StringBuilder(s1);

//         str.insert(2,'a');
//         System.out.println(str);
//         char ans = str.charAt(2);
//         System.out.println(ans);
//         str.setCharAt(2,'b');
//         System.out.println(str);
//         str.delete(2,3);
//         System.out.println(str);
//         System.out.println(str.reverse());
//         System.out.println(str);

//         ///STRING OPERATION
//         String ans1 = str.substring(0,5);
//         System.out.println(ans1);

//     }
// }


// import java.util.*;
// public class String1{
//     public static void main(String args[])
//     {
//         String s1 ;
//         Scanner sc = new Scanner(System.in);
//         s1 = sc.nextLine();

//         String s2 = "VASANI";
//         String s3 = s1+s2;
//         System.out.println(s3);

//         int a = s1.compareTo(s2);
//         System.out.println(a);

//         s2 = s1.substring(1,4);
//         System.out.println(s2);

//         int b = Integer.parseInt("123");
//         System.out.println(b);

//         String s5 = Integer.toString(123);
//         System.out.println(s5+"a");
//     }
// }


// import java.util.*;
// public class String1{
//     public static void main(String args[])
//     {
//         StringBuilder sb = new StringBuilder("VATSAL");
        
//         //create
//         sb.insert(0,'a');
//         System.out.println(sb);

//         //read
//         System.out.println(sb.charAt(0));
//         //update
//         sb.setCharAt(0,'b');
//         System.out.println(sb);
//         //delete
//         sb.delete(0,1);
//         System.out.println(sb.length());

//         sb.append('v');

//         System.out.println(sb);

//     }
// }




























