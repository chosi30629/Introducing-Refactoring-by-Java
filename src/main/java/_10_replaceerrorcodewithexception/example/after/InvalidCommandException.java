package _10_replaceerrorcodewithexception.example.after;


/**
 * (1) 복구 가능한 에러라면 검사 예외 선택
 * 명령어가 잘못되었을 때는 에러 메시지를 표시하는 처리를 한다.
 * 이번 프로그램은 이미 처리되어 있으므로 검사 예외(checked exception)를 작성한다.
 * 검사 예외는 보통 java.lang.Exception 의 하위 클래스로 만든다.(이미 존재하는 검사 예외의 하위 클래스인 경우도 있다.)
 * 자바에서 예외를 나타내는 클래스의 생성자는 일반적으로 예외가 일어났을 때 표시할 부가 정보 문자열을 매개변수로 받는다.
 * 따라서 InvalidCommandException 도 문자열 매개변수를 상위 클래스에 넘기는 생성자를 준비한다.
 *
 * (2) 복구 불가능한 에러 또는 프로그래머 실수로 인한 에러라면 비검사 예외 선택
 * 이 예제 프로그램에서는 비검사 예외를 만들지 않는다.
 * 만약 비검사 예외를 만든다면 java.lang.RumtimeException 의 하위 클래스로 만든다.
 * java.lang.Error 의 하위 클래스로도 가능하지만, Error 는 가상 머신 내부 에러라는 치명적인 에러용으로 준비된 것이므로 일반적인 자바 프로그램
 * 이라면 Error 의 하위 클래스는 작성하지 않는 게 좋다.
 */
public class InvalidCommandException extends Exception {

    public InvalidCommandException(String name) {
        super(name);
    }

    public InvalidCommandException() {

    }

}
