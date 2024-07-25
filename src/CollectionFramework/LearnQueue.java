package CollectionFramework;

import java.util.*;

public class LearnQueue {

    public static void main(String[] args) {

        /*
        Queue<Integer> q = new LinkedList<>() ;
        q.offer(10) ;
        q.offer(20) ;
        q.offer(30) ;
        q.offer(40) ;

        System.out.println(q) ;
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);
        */

        List<Integer> st = new Stack<>() ;
        List<Integer> v = new Vector<>() ;

        Set<Integer> es = new TreeSet<>() ;
        Queue<Integer> q = new LinkedList<>() ;



        // Priority Queue..
        Queue<Integer> pq = new PriorityQueue<>() ;
        pq.offer(10) ;
        pq.offer(20) ;
        pq.offer(30) ;
        pq.offer(40) ;

        System.out.println(pq) ;
    }
}
