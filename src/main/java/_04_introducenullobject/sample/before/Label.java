package _04_introducenullobject.sample.before;


/**
 * 표시 가능한 문자열을 나타내는 클래스
 */
public class Label {
    private final String label;


    public Label(String label) {
        this.label = label;
    }


    public void display() {
        System.out.println("display: " + label);
    }

    public String toString() {
        return "\"" + label + "\"";
    }

}
