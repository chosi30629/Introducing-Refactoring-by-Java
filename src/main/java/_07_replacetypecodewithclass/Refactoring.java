package _07_replacetypecodewithclass;


/**
 * 이름 : 분류 코드를 클래스로 치환(Replace Type Code with Class)
 *
 * 상황 : 객체를 식별하기 위한 분류 코드가 int 같은 기본 타입임
 *
 * 문제 : 타입 판별이 안 됨
 *
 * 해법 : 분류 코드를 나타내는 새로운 클래스를 작성
 *
 * 결과 : 분류코드의 타입 판별이 가능해짐
 *       클래스 개수가 늘어남
 *
 * 방법 : (1) 새로운 클래스를 작성해 기존 인터페이스(API)에서 사용
 *          1) 분류 코드를 나타내는 새로운 클래스 작성
 *              - 호환성을 위해 기본 타입을 사용한 인터페이스(API)를 준비함
 *          2) 기본 타입을 분류 코드로 사용하는 클래스가 새로운 클래스를 사용하도록 변경
 *              - 기본 타입을 사용한 기존 인터페이스(API)를 이용
 *          3) 컴파일해서 테스트
 *       (2) 새로운 인터페이스(API)로 전환
 *          1) 기본 타입을 사용하지 않는 새로운 인터페이스(API) 작성
 *          2) 기본 타입을 사용한 기존 인터페이스(API)를 새로운 인터페이스(API)로 치환
 *          3) 치환할 때마다 컴파일해서 테스트
 *       (3) 기존 인터페이스(API) 삭제
 *          1) 기존 인터페이스(API)를 사용하는 클래스가 없어지면 기존 인터페이스(API) TKRWP
 *          2) 컴파일해서 테스트
 *
 * 관련 항목 : (1) 분류 코드를 하위 클래스로 치환(8장)
 *              - 분류 코드에 따른 동작이 지정되었을 때 사용
 *           (2) 분류 코드를 상태/전략 패턴으로 치환(9장)
 *              - 분류 코드에 따른 동작이 지정되고 분류코드를 하위 클래스로 치환을 쓸 수 없을 때 사용
 *           (3) 생성자를 팩토리 메서드로 치환(11장)
 *              - 분류 코드 값에 따라 인스턴스를 작성할 때 팩토리 메서드를 이용 가능
 */
public class Refactoring {
}
