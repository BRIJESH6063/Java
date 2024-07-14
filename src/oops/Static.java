package oops;

class GFG {
    private static String name = "BrijeshKumar" ;
    public static void getStatic() {
        System.out.println(name) ;
    }
}

public class Static {
    public static void main(String[] args) {
        GFG.getStatic();
        // System.out.println();

    }
}
