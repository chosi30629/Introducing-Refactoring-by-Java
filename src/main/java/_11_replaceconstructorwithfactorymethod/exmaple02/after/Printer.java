package _11_replaceconstructorwithfactorymethod.exmaple02.after;


public abstract class Printer {
    public abstract void println(int n);

    public static Printer create(boolean graphical) {
        // GraphPrinter 와 DigitPrinter 를 팩토리 메서드 안에 숨김
        if (graphical) {
            return new GraphPrinter();
        } else {
            return new DigitPrinter();
        }
    }
}
