package _11_replaceconstructorwithfactorymethod.exmaple02.before;


public class Client {
    private final Printer printer;  // Client 는 Printer 에 의존


    public Client(boolean graphical) {
        if (graphical) {
            printer = new GraphPrinter();  // Client 는 GraphPrinter 에 의존
        } else {
            printer = new DigitPrinter();  // Client 는 DigitPrinter 에 의존
        }
    }

    public void execute() {
        int[] table = { 3, 1, 4, 1, 5, 9 };

        for (int n : table) {
            printer.println(n);
        }
    }


}
