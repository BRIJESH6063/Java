package oops;

/*
The @Override annotation is a marker annotation that is used to indicate that a method is intended to override a method in a superclass. It is not required to use the @Override annotation, but it is a good practice to do so.
Here are some of the benefits of using the @Override annotation:
It can help to prevent errors. If you forget to override a method in a superclass, the compiler will generate an error.
It can make your code more readable and maintainable. When you see the @Override annotation, you know that the method is overriding a method in a superclass.
It can help you to avoid accidentally overloading a method in a superclass. Overloading occurs when you create a method in a subclass with the same name and signature as a method in a superclass.
*/

class Complex {
    int a, b ;
    Complex() {
        System.out.println("Complex Constructor Called!");
        a = 0 ;
        b = 0 ;
    }

}


public class oopsGFG {

    public static void main(String[] args) {

        Complex c = new Complex() ;




    }
}
