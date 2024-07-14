package oops;

public class MainClass {
    public static void main(String[] args) {

        Dog d1 = new Dog() ;
        d1.name = "Tommy" ;
        d1.bark();
        d1.walk() ;
    }
}


// there can be only one public class in a file
// public class Cat
class Dog {
    String name ;
    int Age ;
    String Breed ;

    void walk() {
        System.out.println(name+" is walking...");
    }

    void bark() {
        System.out.println(name+" is barking...");
    }

}
