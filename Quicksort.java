// import java.util.*;
// public class Quicksort{

//     public static int partition(int[] arr,int s_i,int e_i)
//     {
//         int pivot = arr[e_i];
//         int i = s_i - 1;
//         for(int j=s_i;j<e_i;j++)
//         {
//             if(arr[j] < pivot)
//             {
//                 i++;
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;

//             }
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = pivot;
//         arr[e_i] = temp;
//         return i;
//     }

//     public static void quickSort(int[] arr,int s_i,int e_i)
//     {
//         if(s_i<e_i)
//         {
//             int pivot_index = partition(arr,s_i,e_i);
//             quickSort(arr,s_i,pivot_index-1);
//             quickSort(arr,pivot_index+1,e_i);

//         }
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
//         quickSort(arr,0,size-1);
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }


// import java.util.*;
// public class Quicksort{

//     public static int partition(int[] arr,int low,int high)
//     {
//         int i = low-1;
//         int pivot = arr[high];
//         for(int j=low;j<high;j++)
//         {
//             if(arr[j]<pivot)
//             {
//                 i++;
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }

//         }
//         i++;
//         int temp = arr[high];
//         arr[high] = arr[i];
//         arr[i] = temp;
//         return i;
//     }
//     public static void quickSort(int[] arr,int low,int high)
//     {
//         if(low<high)
//         {
//             int pivot_index = partition(arr,low,high);
//             quickSort(arr,low,pivot_index-1);
//             quickSort(arr,pivot_index+1,high);
//         }
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
//         quickSort(arr,0,size-1);
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }




// import java.util.*;
// public class Quicksort{

//     public static int partition(int[] arr,int low,int high)
//     {
//         int i = low-1;
//         int pivot = arr[high];
//         for(int j=low;j<high;j++)
//         {
//             if(arr[j]<pivot)
//             {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = arr[high];
//         arr[high] = temp;
//         return i;

//     }

//     public static void quickSort(int[] arr,int low,int high)
//     {
//         if(low<high)
//         {
//             int pivot_index = partition(arr,low,high);
//             quickSort(arr,low,pivot_index-1);
//             quickSort(arr,pivot_index+1,high); 
//         }
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i=0;i<size;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         quickSort(arr,0,size-1);
//         for(int i=0;i<size;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }






// import java.util.*;
// public class Quicksort{
//     public static int partition(int[] arr,int s_i,int e_i)
//     {
//         int pivot = arr[e_i];
//         int j = s_i - 1;
//         for(int i=s_i;i<e_i;i++)
//         {
//             if(arr[i] < pivot)
//             {
//                 j++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp; 
//             }
//         }
//         j++;
//         int temp = arr[j];
//         arr[j] = pivot;
//         arr[e_i] = temp;
//         return j;
//     }
//     public static void quickSort(int[] arr,int s_i,int e_i)
//     {
//         if(s_i<e_i)
//         {
//             int partition_index = partition(arr,s_i,e_i);
//             quickSort(arr,s_i,partition_index-1);
//             quickSort(arr,partition_index+1,e_i);
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
//         quickSort(arr,0,size-1);
//         for(int i=0;i<size;i++)
//         {
//             System.out.print(arr[i]);
//         }
        
//     }
// }



import java.util.*;
public class Quicksort{

    public static int partition(ArrayList<Integer> arr,int f_i,int e_i)
    {
        int pivot = arr.get(e_i);
        int i = f_i-1;
        for(int j=f_i;j<e_i;j++)
        {
            if(arr.get(j) < pivot)
            {
                i++;
                int temp = arr.get(j);
                arr.set(j,arr.get(i));
                arr.set(i,temp);
            }
        }
        i++;
        int temp = arr.get(e_i);
        arr.set(e_i,arr.get(i));
        arr.set(i,temp);
        return i;
    }

    public static void quickSort(ArrayList<Integer> arr,int f_i,int e_i)
    {
        if(f_i<e_i)
        {
            int partition_index = partition(arr,f_i,e_i);
        quickSort(arr,f_i,partition_index-1);
        quickSort(arr,partition_index+1,e_i);
        }
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            arr.add(sc.nextInt());
        }
        quickSort(arr,0,size-1);

        for(Integer i : arr)
        {
            System.out.print(i+" ");
        }
    }
}