package CollectionFramework;

import java.util.*;

class Student {
    int rollNo ;
    String name ;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}

public class LearnSet {

    public static void main(String[] args) {

        /*
        Set<Integer> set = new HashSet<>() ; // O(1)
        set.add(10) ;
        set.add(50) ;
        set.add(20) ;
        set.add(40) ;
        System.out.println(set);
        set.remove(10) ;
        System.out.println(set);
        // [50, 20, 40, 10] // stored randomly in HashSet
        // [50, 20, 40]


        Set<Integer> set = new LinkedHashSet<>() ;  // O(n)
        set.add(10) ;
        set.add(50) ;
        set.add(20) ;
        set.add(40) ;
        System.out.println(set);
        // stored in order of input because stored in form of list

        Set<Integer> set = new TreeSet<>() ; // O(log(n))
        set.add(10) ;
        set.add(50) ;
        set.add(20) ;
        set.add(40) ;
        System.out.println(set);
        // stored in sorted order since uses binary search tree and prints in inorder traversal.


        hashCode(input) ----> unique identity since duplicate not allowed.


        */

        Set<Student> st = new HashSet<>() ;
        st.add(new Student(1, "Amit")) ;
        st.add(new Student(2, "Amit")) ;
        st.add(new Student(4, "Amit")) ;
        System.out.println(st) ;
        // [Student{rollNo=1, name='Amit'}]
        // [Student{rollNo=1, name='Amit'}, Student{rollNo=2, name='Amit'}, Student{rollNo=4, name='Amit'}]








    }
}
