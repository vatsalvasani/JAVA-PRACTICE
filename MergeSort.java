// import java.util.*;
// public class MergeSort{
//     public static void conquer(int[] arr,int s_i,int mid,int e_i)
//     {
//         int[] helper_arr = new int[e_i - s_i +1];
//         int index1 = s_i;
//         int index2 = mid+1;
//         int i=0;
//         while(index1 <= mid && index2 <= e_i)
//         {
//             if(arr[index1] < arr[index2])
//             {
//                 helper_arr[i++] = arr[index1++];
//             }
//             else{
//                 helper_arr[i++] = arr[index2++];
//             }
//         }
//         while(index1 <= mid)
//         {
//             helper_arr[i++] = arr[index1++];
//         }
//         while(index2 <= e_i)
//         {
//             helper_arr[i++] = arr[index2++];
//         }
//         for(int j=s_i,k=0;k<helper_arr.length;j++,k++)
//         {
//            arr[j] = helper_arr[k];
//         }
//     }
//     public static void divide(int[] arr,int s_i,int e_i)
//     {
//         if(s_i==e_i){
//             return;
//         }
//         else{
//             int mid = s_i - (s_i - e_i)/2;
//             divide(arr,s_i,mid);
//             divide(arr,mid+1,e_i);
//             conquer(arr,s_i,mid,e_i);
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
//         divide(arr,0,size-1);

//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
        
//     }
// }




// import java.util.*;
// public class MergeSort{

//     public static void conquer(int[] arr,int s_i,int mid,int e_i)
//     {
//         int[] helper_arr = new int[e_i-s_i+1];
//         int i=0;
//         int index1 = s_i;
//         int index2 = mid+1;
//         while(index1<=mid && index2<=e_i)
//         {
//             if(arr[index1] < arr[index2])
//             {
//                 helper_arr[i++] = arr[index1++];
//             }
//             else{
//                 helper_arr[i++] = arr[index2++];
//             }
//         }
//         while(index1 <= mid)
//         {
//             helper_arr[i++] = arr[index1++];
//         }
//         while(index2 <= e_i)
//         {
//             helper_arr[i++] = arr[index2++];
//         }
//         i=0;
//         for(int j=s_i;i<helper_arr.length;i++,j++)
//         {
//             arr[j] = helper_arr[i];
//         }
//     }

//     public static void divide(int[] arr,int s_i,int e_i)
//     {
//         if(s_i==e_i)return;
//         int mid = s_i - (s_i-e_i)/2;

//         divide(arr,s_i,mid);
//         divide(arr,mid+1,e_i);
//         conquer(arr,s_i,mid,e_i);
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         divide(arr,0,size-1);
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }


// import java.util.*;
// public class MergeSort{
//     public static void conquer(int[] arr,int f_i,int mid,int l_i)
//     {
//         int index1 = f_i;
//         int index2 = mid+1;
//         int[] helper_arr = new int[l_i-f_i+1];
//         int j = 0;
//         while(index1<=mid && index2<=l_i)
//         {
//             if(arr[index1] < arr[index2])
//             {
//                 helper_arr[j++] = arr[index1++];
//             }
//             else{
//                 helper_arr[j++] = arr[index2++];
//             }
//         }
//         while(index1<=mid)
//         {
//             helper_arr[j++] = arr[index1++];
//         }
//         while(index2<=l_i)
//         {
//             helper_arr[j++] = arr[index2++];
//         }
//         j=0;
//         for(int i=f_i;j<helper_arr.length;j++,i++)
//         {
//             arr[i] = helper_arr[j];
//         }
//     }
//     public static void divide(int[] arr,int f_i,int l_i)
//     {
//         if(f_i==l_i)
//         {
//             return;
//         }
//         int mid = l_i - (l_i-f_i)/2;
//         divide(arr,f_i,mid);
//         divide(arr,mid+1,l_i);
//         conquer(arr,f_i,mid,l_i);
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         divide(arr,0,size-1);
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }









// import java.util.*;
// public class MergeSort{

//     public static void conquer(int[] arr,int s_i,int mid,int l_i)
//     {
//         int index1 = s_i;
//         int index2 = mid+1;
//         int[] helper_arr = new int[l_i-s_i+1];
//         int x = 0;
//         while(index1<=mid && index2<=l_i)
//         {
//             if(arr[index1] < arr[index2])
//             {
//                 helper_arr[x++] = arr[index1++];
//             }
//             else{
//                 helper_arr[x++] = arr[index2++];
//             }

//         }
//         while(index1<=mid)
//         {
//             helper_arr[x++] = arr[index1++];
//         }
//         while(index2<=l_i)
//         {
//             helper_arr[x++] = arr[index2++];
//         }
//         x=0;
//         for(int i=s_i;x<helper_arr.length;i++,x++)
//         {
//             arr[i] = helper_arr[x];
//         }
//     }
//     public static void divide(int[] arr,int s_i,int l_i)
//     {
//         if(s_i == l_i)return;
//         int mid = s_i - (s_i-l_i)/2;
//         divide(arr,s_i,mid);
//         divide(arr,mid+1,l_i);
//         conquer(arr,s_i,mid,l_i);
//     }
//     public static void main(String args[])
//     {
//         Scanner sc  = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         divide(arr,0,size-1);
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }


// import java.util.*;
// public class MergeSort{

//     public static void conquer(int[] arr,int s_i,int mid,int e_i)
//     {
//         int index1 = s_i;
//         int index2 = mid+1;
//         int[] arr1 = new int[e_i-s_i+1];
//         int i=0;
//         while(index1 <= mid && index2 <= e_i)
//         {
//             if(arr[index1] < arr[index2])
//             {
//                 arr1[i++] = arr[index1++];
//             }
//             else{
//                 arr1[i++] = arr[index2++];
//             }

//         }
//         while(index1 <= mid)
//         {
//             arr1[i++] = arr[index1++];
//         }
//         while(index2 <= e_i)
//         {
//             arr1[i++] = arr[index2++];
//         }
//         i=0;
//         for(int j=s_i;i<arr1.length;i++,j++)
//         {
//             arr[j] = arr1[i];
//         }

//     }
//     public static void divide(int[] arr,int s_i,int e_i)
//     {
//         if(s_i==e_i)return;
//         int mid = s_i - (s_i - e_i)/2;
//         divide(arr,s_i,mid);
//         divide(arr,mid+1,e_i);
//         conquer(arr,s_i,mid,e_i);
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i =0;i<arr.length;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         divide(arr,0,size-1);
//         for(int i = 0;i<size;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }


import java.util.*;
public class MergeSort{

    public static void conquer(int[] arr,int f_i,int mid,int e_i)
    {
        int index1 = f_i;
        int index2 = mid+1;
        int[] arr1 = new int[e_i-f_i+1];
        int i = 0;
        while(index1<=mid && index2<=e_i)
        {
            if(arr[index1]<arr[index2])
            {
                arr1[i++] = arr[index1++];
            }
            else{
                arr1[i++] = arr[index2++];
            }
        }
        while(index1<=mid)
        {
            arr1[i++] = arr[index1++];
        }
        while(index2<=e_i)
        {
            arr1[i++] = arr[index2++];
        }
        int j = f_i;
        for(i=0;i<arr1.length;i++,j++)
        {
            arr[j] = arr1[i];
        }
    }

    public static void divide(int[] arr,int f_i,int e_i)
    {
        if(f_i == e_i){
            return;
        }
        int mid  = f_i - (f_i - e_i)/2;
        divide(arr,f_i,mid);
        divide(arr,mid+1,e_i);
        conquer(arr,f_i,mid,e_i);
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        divide(arr,0,size-1);

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
        }
    }
}