package magicnumbertoconstant01;


/**
 * 1) 매직 넘버를 기호 상수로 치환
 *  - 소스 코드에 특정한 숫자(매직 넘버)를 직접 적는 건 좋지 않은 코딩 스타일이다.
 *  - 100                   매직 넘버(의미를 알기 어려움)
 *  - MAX_INPUT_LENGTH      기호 상수(의미를 알기 쉬움)
 *  - 기호 상수에 의존하는 다른 매직 넘버를 찾아서 기호 상수를 사용한 표현식으로 변환한다.
 *  - 가능하다면 기호 상숫값을 변경한 후 컴파일해서 테스트한다.
 *
 * 2) public static final 클래스 필드를 사용
 *  - public 은 클래스 외부에서도 참조할 수 있음
 *  - static 은 클래스 필드로 만듦
 *  - final 은 잘못해서 할당하지 않도록 함
 *
 * 3) 어떤 클래스 안에서만 사용할 기호 상수를 선언한다면 private static final 도 가능하다.
 *
 * 4) 상수 의존 관계
 *  - '작업 영역 길이'와 '최대 입력 길이'라는 두 상수 사이에 의존 관계가 있다고 가정하자.
 *  - 작업 영역 길이는 최대 입력 길이의 2배이다.
 *  - 이때 작업 영역 길이는 최대 입력 길이에 의존한다.
 *  - 이 때는 기호 상수를 따로따로 만들지 않는다.
 *  - 표현식으로 의존 관계를 표현한다.
 *
 * 5) final 필드의 위험성 61 ~ 62 page
 *
 * 6) 배열 인덱스 최솟값이 0 이라는 건 자바 언어 규칙을 정해져 있으므로 일부러 기호 상수를 선언하는 건 의미가 없다.
 */
public class Refactoring {

    public static final int MAX_INPUT_LENGTH = 100;
    /**
     * 표현식으로 의존 관계를 표현
     */
    public static final int WORK_AREA_LENGTH = MAX_INPUT_LENGTH * 2;


    public static void main(String[] args) {
        int inputLength = 50;

        /**
         *  리팩토링 전
         *   - 매직 넘버는 의미를 알기 어려움
         *   - 매직 넘버가 여러 곳에 있으면 변경하기 어려움
        if (100 < inputLength) {

        }
        */

        /**
         * 리팩토링 후
         *  - 상수의 의미를 알기 쉬워짐
         *  - 기호 상수의 값을 변경하면 상수를 사용하는 모든 곳이 변경됨
         *  - 이해하기 어려운 이름을 사용하면 오해가 생길 수 있음
         */
        if (MAX_INPUT_LENGTH < inputLength) {

        }
    }

}
