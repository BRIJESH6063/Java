package oops;



/*
class Base {
    Base() {
        // constructor of base class.
        System.out.println("Base Class Constructor called!..");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived Class Constructor called!..");
    }
}

Output Explanation: Here first superclass constructor will be called thereafter derived(sub-class) constructor will be called because the constructor call is from top to bottom. And yes if there was any class that our Parent class is extending then the body of that class will be executed thereafter landing up to derived classes.
But, if we want to call a parameterized constructor of the base class, then we can call it using super(). The point to note is base class constructor call must be the first line in the derived class constructor.

Implementation: super(_x) is the first line-derived class constructor.


 */

public class Constructor {
    public static void main(String[] args) {

        /*
        Derived d = new Derived() ;

        */
    }
}
