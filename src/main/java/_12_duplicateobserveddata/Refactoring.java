package _12_duplicateobserveddata;


/**
 * 이름 : 관측 데이터 복제
 *
 * 상황 : 데이터를 표시하는 클래스가 있음
 *
 * 문제 : 모델과 뷰가 한 클래스 안에 뒤섞여 있음
 *
 * 해법 : 양쪽을 분리하고 관찰자 패턴 또는 이벤트 리스너로 동기화함
 *
 * 결과 : 클래스 역할이 확실해짐
 *       여러 뷰를 가지거나 뷰를 전화하기 쉬워짐
 *       클래스 숫자가 늘어남
 *       주의하지 않으면 동기화 이벤트가 무한히 발생할 수도 있음
 *
 * 방법 : (1) 모델을 나타내는 클래스 작성
 *          1) 모델을 나타내는 클래스 작성
 *              - 클래스 추출
 *          2) 뷰 : 뷰에서 모델 참조
 *          3) 뷰 : 모델을 메서드로 조작
 *          4) 컴파일해서 테스트
 *       (2) 통지 관련 클래스와 인터페이스 작성
 *          1) 통지 내용을 나타내는 이벤트 선언
 *          2) 통지 관련 인터페이스 선언
 *          3) 통지를 받는 메서드를 뷰에 선언
 *          4) 컴파일해서 테스트
 *       (3) 뷰 등록과 뷰 통지
 *          1) 모델 : 뷰를 모델에 등록 가능하게 만듦
 *          2) 뷰 : 뷰를 모델에 등록
 *          3) 모델 : '모델을 변경하면 뷰에 통지'하는 코드 작성
 *          4) 뷰 : 통지를 받는 메서드 안으로 표시 갱신 처리를 이동
 *          5) 컴파일해서 테스트
 *
 * 관련 항목 : 클래스 추출(6장)
 *              - 모델과 뷰가 뒤섞인 클래스에서 모델이 되는 클래스 추출
 *          자기 캡슐화 필드
 *              - 필드를 직접 다루던 코드에서 게터 메서드나 세터 메서드를 이용하도록 수정
 *          프레젠테이션과 도메인 분리
 *              - 관측 데이터 복제와 비슷한 문제를 다루지만 더 큰 리팩토링
 *
 */
public class Refactoring {
}