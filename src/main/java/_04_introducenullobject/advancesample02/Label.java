package _04_introducenullobject.advancesample02;


/**
 * 팩토리 메서드 패턴, 싱글톤 패턴, 중첩 클래스로 작성
 */
public class Label {
    /**
     * "널 객체는 상수의 종류다"라는 걸 명확하게 소스 코드로 표현
     */
    public final static Label NULL = new NullLabel();
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
