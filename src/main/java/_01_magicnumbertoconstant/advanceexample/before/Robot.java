package _01_magicnumbertoconstant.advanceexample.before;


public class Robot {
    private final String name;
    /**
     * int 가 아닌 RobotCommand 타입으로 변경
     */
    public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
    public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
    public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");

    public Robot(String name) {
        this.name = name;
    }


    public void order(RobotCommand command) {
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
