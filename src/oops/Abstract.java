package oops;

abstract class AbsClass {
    abstract void printInfo() ;
    String name ;
    int age ;
    float salary ;
    AbsClass(String name, int age, float salary) {
        this.name = name ;
        this.age = age ;
        this.salary = salary ;
    }
}

class Child extends AbsClass {
    Child(String name, int age, float salary) {
        super(name, age, salary) ;
    }
    void printInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}




public class Abstract {
    public static void main(String[] args) {
        Child ch = new Child("saurabh", 23, 234443.32F) ;
        ch.printInfo();
    }
}
