package magicnumbertoconstant01.advanceexample.before;


/**
 * 분류 코드를 클래스로 치환하기
 */
public class RobotCommand {
    private final String name;


    public RobotCommand(String name) {
        this.name = name;
    }


    public String toString() {
        return "[ RobotCommand: " + name + " ]";
    }

}
