package _04_introducenullobject.sample.after;


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

    /**
     * 기존 클래스(Label)는 널 객체가 아니므로 false 를 반환
     */
    public boolean isNull() {
        return false;
    }

}
