package _11_replaceconstructorwithfactorymethod;


/**
 * 이름 : 생서자를 팩토리 메서드로 치환
 *
 * 상황 : 인스턴스를 생성함
 *
 * 문제 : 생성하고 싶은 인스턴스가 속한 실제 클래스를 클라이언트에는 숨기고 싶음
 *
 * 해법 : 생성자를 팩토리 메서드로 치환함
 *
 * 결과 : 어느 클래스 인스턴스를 생섣ㅇ할지를 팩토리 메서드 안에서 정할 수 있음
 *       생성한 인스턴스를 변경해도 클라이언트 쪽은 변경하지 않아도 됨
 *       추상도가 너무 올라가면 코드가 오히려 어려워짐
 *
 * 방법 : (1) 팩토리 메서드 작성
 *          1) 팩토리 메서드 작성
 *              - 팩토리 메서드 안에서는 현재 생성자를 호출
 *          2) 팩토리 메서드 호출
 *              - 클라이언트에서 생성자를 호출하는 부분을 수정해서 팩토리 메서드를 호출하도록 함
 *          3) 컴파일해서 테스트
 *       (2) 생성자 숨기기
 *          1) 생성자를 private 로 만듦
 *              - 그러면 생성자를 클라이언트에서 실수로 호출하는 걸 막을 수 있어서 팩토리 메서드 호출이 보장됨
 *          2) 컴파일
 *
 * 관련 항목 : 분류 코드를 하위 클래스로 치환(8장)
 *            - 생성자를 팩토리 메서드로 치환을 한 후에 이 리팩토링을 할 수 있음
 *
 * 프로바이더(provider) : 클래스 라이브러리를 제공하는 '제공자'
 *  - 예를 들어 '암호로 사용하는 의사 난수 발생기의 인스턴스를 java.security.SecureRandom 클래스 인스턴스로 생성하고 싶음
 *  - 하지만 의사 난수 발생기의 클래스 라이브러리는 서드파티(프로바이더)에서 제공함
 *  - 클라이언트를 만든 시점에서는 의사 난수 발생기의 구체적인 클래스명을 알 수 없음
 *  - 프로바이더에 따라 의사 난수 발생기의 구체적인 클래스명은 다를 수도 있음
 *  - 프로바이더와 java.security.SecureRandom 연결은 팩토리 메서드 안에 숨겨지며 동적으로 프로바이더를 로드해서 인스턴스를 생성한다.
 *
 * 팩토리 메서드는 '해당 클래스 자신이 반환값 타입인 클래스 메스드'를 찾으면 많이 발견할 수 있다.
 *
 * 의존성 주입을 사용하면 클래스 의존 관계를 줄일 수 있으므로 클래스를 부품으로 다루기 쉬워진다.
 *
 * DI 컨테이너는 의존성 주입을 사용해서 여러 클래스의 의존 관계를 관리하고 설정에 따라 올바른 조합을 골라 인스턴스를 만들어 내는 프레임워크
 */
public class Refactoring {
}