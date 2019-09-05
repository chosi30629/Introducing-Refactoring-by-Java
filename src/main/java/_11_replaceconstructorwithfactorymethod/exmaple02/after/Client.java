package _11_replaceconstructorwithfactorymethod.exmaple02.after;


public class Client {
    private final Printer printer;  // Client 는 Printer 에 의존


    public Client(boolean graphical) {
        printer = Printer.create(graphical);
    }

    // 의존성 주입 사용
    public Client(Printer printer) {
        this.printer = printer;
    }

    public void execute() {
        int[] table = { 3, 1, 4, 1, 5, 9 };

        for (int n : table) {
            printer.println(n);
        }
    }


}
