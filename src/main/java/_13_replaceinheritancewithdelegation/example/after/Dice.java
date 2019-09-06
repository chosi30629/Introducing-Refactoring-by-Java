package _13_replaceinheritancewithdelegation.example.after;


import java.util.Random;


public class Dice {
    // 외부에서 사용하지 않고 생성자로 초기화한 후에는 다시 할당할 수 없으므로 private final 로 선언
    private final Random random;


    public Dice() {
        /**
         * 강한 악취는 아니지만 중복코드이므로 '매개변수 없는 생성자'에서 this(314159L) 표현식으로 '매개변수 있는 생성자'를 호출
         * Dice 클래스는 생성자가 두 개, 필드가 하나인 작은 클래스이므로 편리함을 잘 모를 수도 있지만 생성자나 초기화해야 할 필드가 많아지면
         * 이런 처리가 무척 유용하다.
         * 생성자 연쇄(Chain Constructors) 리팩토링이라고 부른다.
         */
        // random = new Random(314159L);
        this(314159L);
    }

    public Dice(long seed) {
        random = new Random(seed);
    }


    public int nextInt() {
        return random.nextInt(6) + 1;
    }

    public void setSeed(long seed) {
        random.setSeed(seed);
    }

}
