package _04_introducenullobject.sample.after;


/**
 * null 을 확인하는 객체의 클래스는 Label
 * Label 의 하위 클래스인 널 객체 클래스
 */
public class NullLabel extends Label {

    /**
     * NullLabel 클래스 선언에는 생성자가 없다.
     * 생성자가 없으면 컴파일러는 자동으로 기본 생성자를 삽인한다.
     * NullLabel 의 기본 생성자는 다음과 같다.
     *      public NullLabel() {
     *          super();
     *      }
     * 여기서 super() 는 상위 클래스의 매개변수 없는 생성자를 호출한다.
     * 그런데 상위 클래스인 Label 클래스에는 매개변수 없는 생성자가 존재하지 않다.
     * 그러므로 컴파일 에러
     */
    public NullLabel() {
        /**
         * 컴파일 에러를 고치기 위함
         * 이렇게 하면 기본 생성자가 삽인되지 않으므로 컴파일이 정상 종료
         */
        super("(none)");
    }


    /**
     * <null 동작> 아무것도 처리하지 않음
     */
    @Override
    public void display() {
    }

    /**
     * 널 객체 클래스는 true 를 반환
     */
    @Override
    public boolean isNull() {
        return true;
    }

}


