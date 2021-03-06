package _13_replaceinheritancewithdelegation;


/**
 * 다른 인스턴스의 메소드를 호출해서 처리하는 것을 '처리를 위임한다(delegate)'고 표현한다.
 * 위임(delegation)이란 '맡긴다'는 의미이다.
 *
 * 상속은 클래스 사이의 관계이고, 위임은 인스턴스 사이의 관계이다.
 *  - 이는 상위 클래스에서 상속받을 메서드나 필드는 인스턴스마다 정할 수 없지만, 작업을 위탁할 곳은 인스턴스마다 정할 수 있기 때문이다.
 *
 * 상속은 정적인 관계이고, 위임은 동적인 관계이다.
 *  - 이는 상속 관계는 컴파일할 때 정해지고 실행 중에 변경할 수 없지만, 위임 관계는 실행 중에 변경할 수 있기 때문이다.
 *
 * 이름 : 상속을 위임으로 치환
 *
 * 상황 : 클래스에 상속 관계가 있음
 *
 * 문제 : 하위 클래스가 상위 클래스 기능의 일부만 사용함(사용 거부)
 *       하위 클래스가 상속 클래스와 IS-A 관계가 아님
 *       리스코프 치환 원칙 위반
 *       계약을 지키지 않음
 *
 * 해법 : 위임을 사용해서 상속을 치환함
 *
 * 결과 : 부적절한 상속 관계 해소 가능함
 *       클래스에 필요한 기능이 명확해짐
 *       클래스 개선, 기능 추가가 편해짐
 *       위임하는 메서드를 작성해야 함
 *
 * 방법 : (1) 위임용 필드 도입
 *          1) 하위 클래스에 상위 클래스 타입의 위임용 필드 선언
 *          2) 생성자 안에서 위임용 필드를 this 로 초기화
 *          3) 상속받던 메서드를 재작성해서 위임용 필드를 이용하게 함
 *          4) 컴파일해서 테스트
 *       (2) 상속 관계 삭제
 *          1) 상위 클래스 선언(extends) 삭제
 *          2) 위임용 필드를 상위 클래스의 인스턴스로 초기화
 *          3) 지금까지 외부에서 암묵적으로 이용하던 메서드를 명시적으로 선언
 *          4) 그 메서드를 위임용 필드 경유 호출로 작성
 *          5) 컴파일해서 테스트
 *
 * 관련 항목 : 위임을 상속으로 치환
 *           역리팩토링
 *
 * 상속은 사용하기 전에 충분히 생각해야 한다.
 *  - 상속은 최후의 무기
 *
 * 리스코프 치환 원칙(The Liskov Substitution Principle, LSP)
 *  - 상속을 사용하는 게 좋을지 안 좋을지를 판단하는 데는 리스코프 치환 원칙이 편리하다.
 *  - 'Parent 타입의 변수에 Child 클래스의 인스턴스를 할당해도 문제없이 사용 가능'하게 만들어야 하는 원칙
 *      : ex) before 예제에서
 *            Random r = new Dice(); 후
 *            r.nextBoolean(); 하게 되면
 *            UnsupportedOperationException 을 던지므로 리스코프 치환 원칙을 위배
 *  - 리스코프 치환 원칙은 하위 클래스가 계약을 위반하지 않는지를 확인
 *
 * IS-A 관계와 HAS-A 관계
 *  - IS-A 관계란 'OO 는 DD 의 일종이다'라는 관계이다.
 *  - IS-A 라는 이름은 'OO is a DD'라는 영어 표현에서 유래한다.
 *  - 예를 들어 OO 클래스가 DD 클래스의 하위 클래스라면 'OO 는 DD 의 일종이다'(OO is a DD)'라는 IS-A 관계가 성립해야 한다.
 *  - 반대로 말하면 IS-A 관계가 아닌 클래스끼리 상속 관계를 맺으면 안된다.
 *  - IS-A 관계 여부를 판정하려면 리스코프 치환 원칙을 사용하면 된다.
 *  - HAS-A 관계는 'OO 는 DD 를 가지고 있다'라는 관계이다.
 *  - HAS-A 라는 이름은 'OO has a DD'라는 영어 표현에서 유래한다.
 *  - IS-A 관계가 상속과 관련 있듯이 HAS-A 관계는 위임과 관계있다.
 *  - 그렇다면 OO 클래스의 인스턴스 필드가 DD 클래스의 인스턴스를 저장하고 있다면 'OO 는 DD 를 가지고 있다(OO has a DD)'라는
 *    HAS-A 관계가 성립한다.
 */
public class Refactoring {
}
