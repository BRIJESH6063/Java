package oops;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet() ;
        obj.greeting();
        obj.greeting("brijesh");
    }
}

class Greet {

    public Greet() {
        System.out.println("Object created successfully!");
    }


    void greeting() {
        System.out.println("Hello!, Welcome to the party.");
    }
    void greeting(String name) {
        System.out.println("Hello! "+ name + ", Welcome to the party.");
    }
}
