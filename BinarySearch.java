import java.util.*;
public class BinarySearch{

    public static int search(int[] arr,int find)
    {
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = high - (high - low)/2;
            if(arr[mid] == find)
            {
                return mid;
            }
            else if(arr[mid] < find)
            {
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,5,89};
        int find = sc.nextInt();
        System.out.print(search(arr,find));
    }
}