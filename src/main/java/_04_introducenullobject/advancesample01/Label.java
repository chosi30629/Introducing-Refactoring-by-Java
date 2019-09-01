package _04_introducenullobject.advancesample01;


/**
 * 팩토리 메서드 패턴, 싱글톤 패턴, 중첩 클래스로 작성
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

    public boolean isNull() {
        return false;
    }


    // 팩토리 메서드
    public static Label newNull() {
        return NullLabel.getInstance();
    }

    // 널 객체
    private static class NullLabel extends Label {
        // 싱글톤
        private static final NullLabel singleton = new NullLabel();


        private static NullLabel getInstance() {
            return singleton;
        }

        private NullLabel() {
            super("(none)");
        }

        @Override
        public void display() {
        }

        @Override
        public boolean isNull() {
            return true;
        }
    }
}
