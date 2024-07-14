package oops;

/*
### INHERITANCE
class Base {
    int x ;
    Base(int x) {
        this.x = x ;
        System.out.println("Derived class constructor called!");
    }
}

class Derived extends Base {
    int y ;
    Derived(int x, int y) {
        super(x) ;
        this.y = y ;
        System.out.println("Derived class constructor called!");
    }
}

### MULTIPLE INHERITANCE
class Parent1 {
    Parent1() {
        System.out.println("Parent1 constructor called!");
    }
    void fun() {
        System.out.println("Parent1 constructor called!");
    }
}

class Parent2 {
    Parent2() {
        System.out.println("Parent2 constructor called!");
    }
    void fun() {
        System.out.println("Parent2 constructor called!");
    }
}

class Child extends Parent1, Parent2 {
    Child() {
        System.out.println("Child constructor called!");
    }
}

Output: Compilation error is thrown
Conclusion: As depicted from code above, on calling the method fun() using Test object will cause complications
such as whether to call Parent1’s fun() or Parent2’s fun() method.

          GrandParent
           /     \
          /       \
      Parent1      Parent2
          \       /
           \     /
             Test

Again it throws compiler error when run fun() method as multiple inheritances cause a diamond problem when allowed in
other languages like C++. From the code, we see that: On calling the method fun() using Test object will cause
complications such as whether to call Parent1’s fun() or Parent2’s fun() method. Therefore, in order to avoid such
complications, Java does not support multiple inheritances of classes.

Multiple inheritance is not supported by Java using classes, handling the complexity that causes due to multiple
inheritances is very complex. It creates problems during various operations like casting, constructor chaining, etc,
and the above all reason is that there are very few scenarios on which we actually need multiple inheritances, so
better to omit it for keeping things simple and straightforward.



*/



public class Inheritance {
    public static void main(String[] args) {

        /*
         Derived d = new Derived(3, 5) ;
         System.out.println(d.x+" : "+d.y);
        */

    }
}
