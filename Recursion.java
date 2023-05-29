// import java.util.*;
// public class Recursion{

//     //print sum of n natural number
//     public static void sumOfNumber(int x,int ans)
//     {
//         if(x == 0)
//         {
//             ans += x;
//             System.out.println(ans);
//             return;
//         }
//         else{
//             ans+=x;
//             sumOfNumber(x-1,ans);
//         }
//     }

//     //print number from 5 to 1;
//     public static void printNumber(int num)
//     {
//         if(num == 0) {
//             System.out.println("0");
//             return;
//         }
//         else{
//             System.out.println(num);
//             printNumber(num-1);
//             // System.out.println(num);
//         }

//     }
//     //fact 
//     public static int fact(int num)
//     {
//         if(num==0)return 1;
//         if(num==1)return 1;

//         return fact(num-1)*num;
//     }

//     public static void itr_fact(int num)
//     {
//         int ans = 1;
//         while(num!=0)
//         {
//             ans = num * ans;
//             num-=1;
//         }
//         System.out.println(ans);
//     }
//     //fibonacci
//     public static void fibonacci(int num,int a,int b)
//     {
//         if(num<=0)
//         {
//             return ;
//         }
//         int c = a + b;
//         System.out.println(c);
//         fibonacci(num-1,b,c);

//     }

//     //x^n
//     public static int pow(int x,int n)
//     {
//         if(n==0)return 1;
//         if(n==1)return x;
//         return pow(x,n-1)*x;
//     }
//     public static int powLogn(int x,int n)
//     {
//         if(n==0)return 1;
//         if(n==1)return x;
//         if(n%2 == 0)
//         {
//             return (powLogn(x,n/2)*powLogn(x,n/2));
//         }
//         else{
//             return (powLogn(x,n/2)*powLogn(x,n/2)*x);
//         }
//     }

//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         printNumber(num);

//         sumOfNumber(num,0);

//         int ans_fact = fact(num);
//         System.out.println(ans_fact);

//         itr_fact(num);

//         System.out.println("\n");
//         System.out.println(0);
//         System.out.println(1);
//         fibonacci(num-2,0,1);

//         System.out.println("\n");
//         int pow_ans = pow(5,2);
//         System.out.println(pow_ans);
        
//         System.out.println("\n");
//         pow_ans = powLogn(5,3);
//         System.out.println(pow_ans);


//     }
// }


// import java.util.*;
// public class Recursion{

//     public static int towerOfHanoi(int num)
//     {
//         if(num==1)return 1;
//         return (2*(towerOfHanoi(num-1))+1);
//     }

//     // public static void towerOfHanoi1(int num,String s,String h,String d)
//     // {
//     //     if(num == 0)
//     //     {
//     //         return;
//     //     }
//     //     else{
//     //         towerOfHanoi1(num - 1,s,d,h);
//     //         System.out.println(num+"from"+s+"to"+d);
//     //         towerOfHanoi1(num-1,h,s,d);
//     //     }

//     // }


//     public static void towerOfHanoi1(int num,String s,String h,String d)
//     {
//         if(num == 1)
//         {
//             System.out.println(num + "from" + s + "to" + d);
//             return;
//         }
        
//         else{
//             towerOfHanoi1(num-1,s,d,h);
//             System.out.println(num + "from" + s + "to" + d);
//             towerOfHanoi1(num-1,h,s,d);
//         }
//     }

//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int ans_toh = towerOfHanoi(num);
//         System.out.println(ans_toh);

//         towerOfHanoi1(num,"S","H","D");
//     }
// }



// import java.util.*;
// public class Recursion{

//     public static void printInReverse(StringBuilder sb)
//     {
//         if(sb.length()==1){
//             System.out.print(sb);
//         }
//         else{
//             System.out.print(sb.charAt(sb.length()-1));
//             printInReverse(sb.delete(sb.length()-1,sb.length()));
//         }
//     }

//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         StringBuilder sb = new StringBuilder(s);
//         printInReverse(sb);
//     }
// }

//first and last occurence of element
// import java.util.*;
// public class Recursion{

    // public static void firstAndLastOccurence(StringBuilder sb,char ch,int f_i,int l_i,int index)
    // {
    //     if(sb.length()==index+1){
    //         if(sb.charAt(index) == ch){
    //             if(f_i == -1)
    //             {
    //                 f_i = index;
    //                 l_i = index;
    //             }
    //             else{
    //                 l_i = index;
    //             }
    //         }
    //         System.out.print(f_i+" "+l_i);
    //         return;
    //     }
    //     else{
    //         if(sb.charAt(index) == ch)
    //         {
    //             if(f_i == -1)
    //             {
    //                 f_i = index;
    //                 l_i = index;
    //             }
    //             else{
    //                 l_i = index;
    //             }
    //         }
    //         firstAndLastOccurence(sb,ch,f_i,l_i,index+1);
    //     }


    // }

//     public static void firstAndLastOccurence(StringBuilder sb,char ch,int f_i,int l_i,int index)
//     {
//         if(index+1 == sb.length())
//         {
//             if(sb.charAt(index) == ch)
//             {
//                 if(f_i == -1)
//                 {
//                     f_i = index;
//                     l_i = index;
//                 }
//                 else{
//                     l_i = index;
//                 }
//             }
//             System.out.print((f_i) + " " + l_i);
//             return;
//         }
//         else{
//             if(sb.charAt(index) == ch)
//             {
//                 if(f_i == -1)
//                 {
//                     f_i = index;
//                     l_i = index;
//                 }
//                 else{
//                     l_i = index;
//                 }
//             }
//             firstAndLastOccurence(sb,ch,f_i,l_i,index+1);
//         }
//     }



//     public static void main(String args[])
//     {
//         Scanner sc =new Scanner(System.in);
//         String s = sc.nextLine();
//         StringBuilder sb = new StringBuilder(s);
//         firstAndLastOccurence(sb,'a',-1,-1,0);
//     }
// }

//check strictly increased sort
// import java.util.*;
// public class Recursion{

//     public static void checkSort(int[] arr,int index)
//     {
//         if(index==arr.length-1)
//         {
//             System.out.println("YES");
//         }
//         else{
//             if(arr[index] < arr[index+1])
//             {
//                 checkSort(arr,index+1);
//             }
//             else{
//                 System.out.println("NO");
//                 return;
//             }
//         }
//     }

//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i=0;i<size;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         checkSort(arr,0);
//     }
// }

//put all x at the end
// import java.util.*;
// public class Recursion{
//     public static void putAllAtEnd(StringBuilder sb,int index,int traverse,char ch)
//     {
//         if(sb.length() == traverse+1)
//         {
//             System.out.println(sb);
//             return;
//         }
//         else{
//             if(sb.charAt(index) == ch)
//             {
//                 sb.delete(index,index+1);
//                 sb.append(ch);
//                 putAllAtEnd(sb,index,traverse+1,ch);
//             }
//             else{
//                 putAllAtEnd(sb,index+1,traverse+1,ch);
//             }
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         StringBuilder sb = new StringBuilder(s);

//         putAllAtEnd(sb,0,0,'a');

//     }
// }


//remove duplicate
// import java.util.*;
// public class Recursion{
//     public static void removeDuplicate(StringBuilder sb,int index,int[] arr,int traverse,int size)
//     {
//         if(size == traverse)
//         {
//             System.out.print(sb);
//             return;
//         }
//         else{
//             if(arr[sb.charAt(index) - 'a'] == 1)
//             {
//                 sb.delete(index,index+1);
//                 removeDuplicate(sb,index,arr,traverse+1,size);
//             }
//             else{
//                 arr[sb.charAt(index) - 'a'] = 1;
//                 removeDuplicate(sb,index+1,arr,traverse+1,size);
//             }
//         }
//     }

//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         StringBuilder sb = new StringBuilder(s);
//         int[] arr = new int[26];
//         removeDuplicate(sb,0,arr,0,sb.length());
//     }
// }





//SUBSEQUENCE
// import java.util.*;
// public class Recursion{
//     public static void subsequence(String sb,String sb1,int index,HashSet<String> hs)
//     {
//         if(sb.length()==index)
//         {
//             if(hs.contains(sb1))
//             {
//                 return;
//             }
//             else{
//                 hs.add(sb1);
//                 System.out.println(sb1);
//                 return;
//             }
            
//         }
//         else{
//             char c = sb.charAt(index);
//             subsequence(sb,sb1,index+1,hs);
//             subsequence(sb,sb1+c,index+1,hs);
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         HashSet<String> hs = new HashSet<>();
//         String s = sc.nextLine();
//         subsequence(s,"",0,hs);
//     }
// }



//Print Keypad Combination
// import java.util.*;
// public class Recursion{

//     public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

//     public static void keyPad(String input,int traverse,String ans)
//     {
//         if(input.length()==traverse)
//         {
//             System.out.println(ans);
//             return;
//         }
//         else{
//             for(int i=0;i<keypad[input.charAt(traverse) - '0'].length();i++)
//             {
//                 keyPad(input,traverse+1,ans+keypad[input.charAt(traverse) - '0'].charAt(i));
//             }
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         keyPad(s,0,"");
//     }
// }\





//////////////////////////////ADVANCE QUESTION

//print all permutation

// import java.util.*;
// public class Recursion{
//     public static void permutation(String sb,String s)
//     {
//         if(sb.length()==0)
//         {
//             System.out.println(s);
//             return;
//         }
//         else{
//             for(int i=0;i<sb.length();i++)
//             {
//                 permutation(sb.substring(0,i) + sb.substring(i+1,sb.length()),s + sb.charAt(i));
//                 s = s.substring(0,s.length()-1);
//             }
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         // StringBuilder sb = new StringBuilder(s);
//         permutation(s,"");
//     }
// }

//MAZE problem
// import java.util.*;
// public class Recursion{
//     public static int ratMaze(int n,int m)
//     {
//         if(n==1 || m==1)
//         {
//             return 1;
//         }
//         return ratMaze(n-1,m) + ratMaze(n,m-1);
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         System.out.println(ratMaze(n,m));
//     }
// }

// //TILES PROBLEM n*m Area 1*m tiles
// import java.util.*;
// public class Recursion{
//     public static int noOfWayForTiles(int n,int m)
//     {
//         if(n==m)return 2;
//         if(n<m)return 1;

//         return noOfWayForTiles(n-1,m)+noOfWayForTiles(n-m,m);
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         System.out.println(noOfWayForTiles(row,col));
        
//     }
// }

//INVITE N PEOPLE INTO THE PARTY EITHER SINGLE OR PAIR
// import java.util.*;
// public class Recursion{
//     public static int nPeopleInParty(int n)
//     {
//         if(n==2)return 2;
//         if(n==1)return 1;
//         return nPeopleInParty(n-1)+((n-1)*nPeopleInParty(n-2));
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(nPeopleInParty(n));
//     }
// }

//print all subset of n natural number
// import java.util.*;
// public class Recursion{
//     public static void print(ArrayList<Integer> arr)
//     {
//         for(int i=0;i<arr.size();i++)
//         {
//             System.out.print(arr.get(i) + " ");
//         }
//         System.out.print("\n");
//     }
//     public static void subset(int n,ArrayList<Integer> arr)
//     {
//         if(n==0)
//         {
//             print(arr);
//             return;
//         }
//         else{
//             arr.add(n);
//             subset(n-1,arr);
//             arr.remove(arr.size()-1);
//             subset(n-1,arr);
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<Integer> arr = new ArrayList<>();
//         subset(n,arr);
//     }
// }
