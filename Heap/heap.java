import java.util.*;
class Heap1{
    ArrayList<Integer> arr;
    Heap1()
    {
        arr = new ArrayList<Integer>();
    }

    void insert(int x)
    {
        arr.add(x);
        int childIndex = arr.size()-1;
        if((((arr.size()-1) - 1)/2) >= 0){
            int parentIndex = ((arr.size()-1) - 1)/2;
            while(arr.get(parentIndex) > arr.get(childIndex))
           {
            swap(parentIndex,childIndex);
            childIndex = parentIndex;
            parentIndex = (childIndex - 1)/2;
           }
        }
    }
    void heapify_max_heap(int x,int size)
    {
        int leftchildIndex = (2*x)+1;
        int rightchildIndex = (2*x)+2;
        int parentIndex = x;
        int max_index = x;
        if(leftchildIndex<size && arr.get(leftchildIndex)>arr.get(parentIndex))
        {
            max_index = leftchildIndex;
        }
        if(rightchildIndex<size && arr.get(rightchildIndex)>arr.get(parentIndex))
        {
            max_index = rightchildIndex;
        }
        if(max_index!=x)
        {
            swap(x,max_index);
            heapify_max_heap(max_index,size);
        }
    }
    void heapSort()
    {
        int n = arr.size();
        for(int i = n/2;i>=0;i--)
        {
            heapify_max_heap(i,n);
        }
        for(int i=n-1;i>0;i--)
        {
            swap(0,i);
            heapify_max_heap(0,i);
        }
    }
    void swap(int parentIndex,int childIndex)
    {
        int temp = arr.get(parentIndex);
        arr.set(parentIndex,arr.get(childIndex));
        arr.set(childIndex,temp);
    }

    void delete()
    {
        swap(0,arr.size()-1);
        arr.remove(arr.size()-1);
        heapify(0);
    }
    void heapify(int parentIndex)
    {
        int leftchildIndex = (2*parentIndex)+1;
        int rightchildIndex = (2*parentIndex)+2;
        int minIndex = parentIndex;
        if(leftchildIndex < arr.size() && arr.get(minIndex) > arr.get(leftchildIndex))
        {
            minIndex = leftchildIndex;
        }
        if(rightchildIndex<arr.size() && arr.get(minIndex) > arr.get(rightchildIndex))
        {
            minIndex = rightchildIndex;
        }
        if(minIndex != parentIndex)
        {
            swap(minIndex,parentIndex);
            heapify(minIndex);
        }
    }
    int peek(){
        return arr.get(0);
    }

}

public class heap{
    public static void main(String args[])
    {
        Heap1 h = new Heap1();
        h.insert(2);
        h.insert(3);
        h.insert(4);
        h.insert(5);
        h.insert(10);
        h.insert(1);

        System.out.print(h.peek());
        System.out.print(h.arr);
        h.delete();
        System.out.print(h.arr);

        h.heapSort();
    }
}