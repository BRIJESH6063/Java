package ErrorHandling;

class MyException extends Exception {
    public MyException(String message) {
        super(message) ;
    }
}



public class Error {

    public static void main(String[] args) {

        /*
        try {
            // System.out.println(2/0);

            int a[] = {12, 45, 56, 23, 56} ;
            System.out.println(a[a.length+7]);

        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Error Found..");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Exception in code");
        }
        // Handles all kind of Runtime exception/error
        catch (RuntimeException e) {
            System.out.println("Runtime exception occured!.. ");
        } catch (Exception e) {
            // handles all kind of exceptions
            System.out.println("Error handling done successfully...");
        } finally {
            // always executed doesn't matter error occurs or not.
            System.out.println("Finally section executed.. ");
        }

        try {
            int x = 1232 ;
            if(x > 100) {
                // throw new ArithmeticException("number greater then 100 not accepted!.") ;
                throw new MyException("number greater then 100 not accepted!.") ;
            }
        } catch(Exception e) {
            System.out.println(e);
        }

        */






    }
}

/*
There are some cases when finally block will not be executed..
1. use of System.exit() method.
2. Exception occur in finally block.
3. Death of thread.
*/