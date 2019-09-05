package _11_replaceconstructorwithfactorymethod.exmaple02.before;


public class GraphPrinter extends Printer {

    public void println(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.printf(" (%d)", n);
        System.out.println();
    }
    
}

