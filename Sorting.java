// import java.util.*;
// public class Sorting{

//     public static void printArr(int[] arr)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.print('\n');
//     }

//     public static int[] bubbleSort(int[] arr)
//     {
//         for(int i=0;i<(arr.length -1);i++)
//         {
//             for(int j=0;j<arr.length - i -1;j++)
//             {
//                 if(arr[j] > arr[j+1])
//                 {
//                     int temp = arr[j+1];
//                     arr[j+1] = arr[j];
//                     arr[j] = temp;   
//                 }
//             }
//         }
//         return arr;
//     }

//     public static int[] selectionSort(int[] arr)
//     {
//         for(int i=0;i<arr.length - 1;i++)
//         {
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[j] < arr[smallest])
//                 {
//                     smallest = j;
//                 }
//             }
//             int temp  = arr[i];
//             arr[i] = smallest;
//             arr[smallest] = temp; 
//         }
//         return arr;
//     }

//     public static int[] insertionSort(int[] arr)
//     {
//         int[] ans = new int[arr.length];
//         ans[0] = arr[0];
//         for(int i = 1;i<arr.length;i++)
//         {
//             int j = i-1;
//             while((arr[i] < ans[j]) && j>=0)
//             {
//                ans[j+1] = ans[j];
//                j--;
//             }
//             ans[j+1] = arr[i];
//         }
        
//         return ans;
//     }


//     public static void main(String args[])
//     {
//         int size ;
//         Scanner sc = new Scanner(System.in);
//         size = sc.nextInt();
//         int[] arr = new int[size];

//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i] = sc.nextInt();
//         }

//         int[] bub_ans = bubbleSort(arr);
//         printArr(bub_ans);

//         int[] slect_ans = selectionSort(arr);
//         printArr(slect_ans);

//         int[] insert_ans = insertionSort(arr);
//         printArr(insert_ans);
//     }
// }

import java.util.*;
public class Sorting{
    // void bubbleSort(int[] arr)
    // {
    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //         for(int j=0;j<arr.length-i-1;j++)
    //         {
    //             if(arr[j]>arr[j+1])
    //             {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    //     for(int i =0;i<arr.length;i++)
    //     {
    //         System.out.print(arr[i]);
    //     }
    // }

    // public static void insertionSort(int[] arr)
    // {
    //     int[] ans = new int[arr.length];
    //     ans[0] = arr[0];
    //     for(int i=1;i<arr.length;i++)
    //     {
    //         int j = i - 1;
    //         while(j>=0 && ans[j]>arr[i])
    //         {
    //             ans[j+1] = ans[j];
    //             j--;
    //         }
    //         ans[j+1] = arr[i];
    //     }
    //     for(int i =0;i<ans.length;i++)
    //     {
    //         System.out.print(ans[i]);
    //     }
    // }


    public static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int smallest = arr[i];
            int index = i;
            for(int j = i;j<arr.length;j++)
            {
                if(arr[j]<smallest)
                {
                    smallest = arr[j];
                    index = j;
                }

            }
            int temp = arr[i];
            arr[i] = smallest;
            arr[index] = temp;
        }
         for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        Sorting s = new Sorting();
        // bubbleSort(arr);
        // insertionSort(arr);
        selectionSort(arr);
    }
}