package Comparator;

import java.util.ArrayList;
import java.util.* ;

public class Compare {
    public static void main(String[] args) {
        Animal a1 = new Animal(2, "Tom", 12) ;
        Animal a2 = new Animal(4, "Leo", 7) ;
        Animal a3 = new Animal(2, "John", 6) ;
        Animal a4 = new Animal(3, "Maxo", 9) ;

        List<Animal> dogs = new ArrayList<>() ;
        dogs.add(a1) ;
        dogs.add(a2) ;
        dogs.add(a3) ;
        dogs.add(a4) ;

        // System.out.println(dogs);
        // dogs.sort() ;
        // Collections.sort(dogs) ;
        Collections.sort(dogs, (d1, d2) -> {
            if(d1.age == d2.age) {
                return  d1.name.compareTo(d2.name) ;
            } else return  d1.age > d2.age ? 1 : -1 ;
        }) ;
        System.out.println(dogs) ;


    }
}
