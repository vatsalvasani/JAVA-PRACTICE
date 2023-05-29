import java.util.*;

public class Priorityqueue{
    static class Student implements Comparable<Student>{
    String name;
    int marks;
    Student(String n,int m)
    {
        this.name = n;
        this.marks = m;
    }

    @Override
    public int comapareTo(Student s2)
    {
        return this.marks - s2.marks;
    }
}
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(3);
        pq.add(2);

        while(!pq.isEmpty())
        {
            System.out.print(pq.peek());
            pq.remove();
        }

        PriorityQueue<Student> pq1 = new PriorityQueue<>();
        pq1.add(new Student("vatsal",12));
        pq1.add(new Student("bharatbhai",12));
        pq1.add(new Student("vasani",12));
        pq1.add(new Student("dhvani",12));
        
    }
}