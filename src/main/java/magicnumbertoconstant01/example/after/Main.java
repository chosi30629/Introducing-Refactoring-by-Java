package magicnumbertoconstant01.example.after;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot("seongil");

        robot.order(Robot.COMMAND_WALK);
        robot.order(Robot.COMMAND_STOP);
        robot.order(Robot.COMMAND_JUMP);
    }

}
