// public class FirstClass{
//     public static void main(String args[])
//     {
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//     }
// }
// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         double name = sc.nextDouble();
//         name +=1;
//         System.out.println(name);
//     }
// }

// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(a+b);
//     }

// }

// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         System.out.print("Enter Your Age\n");
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age>=18)
//         {
//             System.out.println("YES");
//         }
//         else
//         {
//             System.out.println("NO");
//         }
//     }
// }


// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         System.out.println("Enter Number");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(num%2==0)
//         {
//             System.out.print("COrrect\n");
//         }
//         else if(num<2)
//             System.out.println("NO");
//         else{
//             System.out.println("NOOOOOOOOOOOO");
//         }
//     }
// }


// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         switch(num)
//         {
//             case 1:
//                 System.out.print("1");
//                 break;
//             case 2:
//                 System.out.print("2");
//                 break;
//             default:
//                 System.out.print("D");
//         }
//     }
// }


// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER FIRST NUM : ");
//         int num1 = sc.nextInt();
//         System.out.println("ENTER SECOND NUM : ");
//         int num2 = sc.nextInt();
//         System.out.println("ENTER OPERATOR : ");
//         char op = sc.next().charAt(0);
//         switch(op){
//             case '+':
//                 System.out.println("ANS : " + (num1 + num2));
//                 break;
//             case '-':
//                 System.out.println("ANS : "+ (num1 - num2));
//         }
//     }
// }

// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i = 0;i<a;i++)
//         {
//             System.out.println(i);
//         }

//         while(a>0)
//         {
//             System.out.println(a);
//             a--;
//         }
//         a=10;
//         do
//         {
//             System.out.println(a);
//             a--;
//         }while(a>0);


//     }
// }

// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 1;
//         do{
//             System.out.println(n + " * " + i + " " + (n*i));
//             i++;
//         }while(i!=11);
//     }
// }


// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=0;i<a;i++)
//         {
//             for(int j=0;j<b;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         for(int i=0;i<a;i++)
//         {
//             for(int j=0;j<b;j++)
//             {
//                 if(i==0 || i==a-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     if(j==0 || j==b-1)
//                     {
//                         System.out.print("*");
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//                 }

//             }
//             System.out.print("\n");
//         }
//     }
// }



// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 if((i+j+1) % 2 == 0)
//                 {
//                     System.out.print("0\t");
//                 }
//                 else{
//                     System.out.print("1\t");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }



// import java.util.*;
// public class FirstClass{
//     public static int fact(int n)
//     {
//         if(n==0)
//         {
//             return 1;
//         }
//         return fact(n-1)*n;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int x1 = sc.nextInt();

//         int ans = fact(x1);
//         System.out.println(ans);

//     }
// }








// ########Average of Number
// import java.util.*;
// public class FirstClass{

//     public static double Average(int a,int b,int c)
//     {
//         return ((double)a+(double)b+(double)c)/3;
//     }

//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         double ans = Average(a,b,c);
//         System.out.println(ans);
//     }
// }

// ######## Sum Of All Odd From 1 to n
// import java.util.*;
// public class FirstClass{
//     public static void printNum(int n)
//     {
//         for(int i=1;i<=n;i++)
//         {
//             System.out.println(i);
//             i++;
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printNum(n);
//     }
// }



//######### greater of two
// import java.util.*;
// public class FirstClass{
//     public static int greater_of_two(int a,int b)
//     {
//         if(a>=b)return a;
//         return b;
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(greater_of_two(a,b));
//     }
// }




//########## Circumstances Of Circle
// import java.util.*;
// public class FirstClass{
//     public static void Circumstances(int radius)
//     {
//         System.out.println((2*3.14*radius) + "INT");
//     }
//     public static void Circumstances(double radius)
//     {
//         System.out.println((2*3.14*radius) + "DOUBLE");
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         double radius = sc.nextDouble();
//         Circumstances(radius);
//     }
// }





//########## Infinite Loop With DO....WHILE
// public class FirstClass{
//     public static void main(String args[])
//     {
//         int i = 1;
//         do{
//             System.out.print(i);
//             i++;
//         }while(i>0);
//     }
// } 


// Count 0 ,positive and negative
// import java.util.*;
// public class FirstClass{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int i;
//         int count0=0;
//         int countp=0;
//         int countn=0;
//         do{
//             i = sc.nextInt();
//             if(i==0)
//             {
//                 count0++;
//             }
//             else if(i>0)
//             {
//                 countp++;
//             }
//             else
//             {
//                 countn++;
//             }
//         }while(i!=200);
//         System.out.println(count0+"\n");
//         System.out.println(countn+"\n");
//         System.out.println(countp+"\n");
//     }
// }




//####### power Function
// import java.util.*;
// public class FirstClass{
//     public static int pow(int x,int n)
//     {
//         if(n==0)return 1;
//         return pow(x,n-1)*x;

//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int n = sc.nextInt();
//         int ans = pow(x,n);
//         System.out.println(ans);
//     }
// }


//###### gcd
// import java.util.*;
// public class FirstClass{
//     public static int gcd(int a,int b)
//     {
//         if(b==0)return a;
//         return gcd(b,a%b);
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int ans = gcd(a,b);
//         System.out.print(ans);
//     }
// }



//########## Fibonacci
// import java.util.*;
// public class FirstClass{
//     public static void fibo(int n)
//     {
//         int a=0;
//         int b=1;
//         int i=0;
//         int temp = 0;
//         System.out.println(0);
//         i++;
//         if(n>=2)
//         {
//             System.out.println(1);
//             i++;
//         }
//         for(;i<n;i++)
//         {
//             System.out.println(a+b);
//             temp=b;
//             b=a+b;
//             a=temp;
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         fibo(a);
//     }
// }






