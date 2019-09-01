package _01_magicnumbertoconstant.example.after;


public class Robot {
    private final String name;
    /**
     * 가능하다면 기호 상숫값을 변경한 후 컴파일해서 테스트
     *  - 명령어 값을 0, 1, 2 가 아니라 100, 200, 300 처럼 바꿔도 리컴파일하면 문제없이 동작할 것이다.
     */
    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    public Robot(String name) {
        this.name = name;
    }


    public void order(int command) {
        if (command == COMMAND_WALK) {
            System.out.println(name + " walks.");
        } else if (command == COMMAND_STOP) {
            System.out.println(name + " stops.");
        } else if (command == COMMAND_JUMP) {
            System.out.println(name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }

}
