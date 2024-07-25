//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner ;



/* Multi Line Comment

System.out.println("Fuck World!");
System.out.println(238*34);
int $age = 845 ;
int #fuck = 3247 ; // wrong
System.out.println($age);


boolean isPassed = true ;
int count = 12 ;
byte marks = 127 ;
short studentCount = 12345 ;
System.out.println(isPassed + " " + count + "" + marks + " " + studentCount);
// float pi = 3.14 ;
// by default decimal number is double.
float pi = 3.14f ;
double secondPi = 3.14 ;
System.out.println(pi + " " + secondPi);

char myLetter = 'A' ;
System.out.println(myLetter);

// DataType Conversion
int y = 34 ;
float x = y ;
System.out.println(x);

*/

/*
int x = 34 ;
int y = 3 ;
double div = x / (float)y ;
System.out.println(div) ;

System.out.println(true);
boolean x = true;
*/
// int x = 1 ;
// System.out.println(x==2?"x is 2":x == 3?"x is 3":"x is neither 2 nor 3");


/*
Scanner sc = new Scanner(System.in) ;
// int age = sc.nextInt() ;
// System.out.println("Your age is : " + age) ;
int firstNumber = sc.nextInt() ;
int secondNumber = sc.nextInt() ;
System.out.println(firstNumber+secondNumber);
// similarly for float

sc.close() ; // recommended practise..
// means job of sc is over now garbagecollector will remove from space
// java keeps memory clean by self.
*/

/*
boolean cond = true ;
if(cond) {
    System.out.println("The True Statement") ;
} else {
    System.out.println("The False Statement");
}

// JAVA SWITCH STATEMENT
int x = 4 ;
switch (x) {
    case 0: case 1: // for both 0 and 1
        System.out.println("The x value is 0");
        break;
    case 2:
        System.out.println("The x value is 1");
        break;
    case 3:
        System.out.println("The x value is 0");
        break;
    default:
        System.out.println("The x value is greater than 3");
        break;
}

// JAVA TERNARY OPERATOR
int a = 12, b = 19, c = 14 ;
System.out.println(a>b ? (a>c ? a : c) : (b>c) ? b : c);

{
    System.out.println("before continue");
    // CONTINUE to jump to the next iteration of the loop immediately
    // cannot be used after the loop
    // continue ;
    System.out.println("after continue");
}

Scanner sc = new Scanner(System.in) ;
// Nested LOOPS
int n = sc.nextInt() ;
for(int i=0; i<n; i++) {
    for(int j=0; j<i; j++) System.out.print(" ");
    for(int j=i; j<n; j++) System.out.print("*");
    System.out.println();
}

outerloop:
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
        if(i == j) continue outerloop ;
        // jumps to next iteration of outer loop while executing inner loop
        if(i == j && j == 10) break outerloop ;
        // jumps out of the outer loop while executing inner loop
    }

}

*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java on IntelliJID");




    }
}