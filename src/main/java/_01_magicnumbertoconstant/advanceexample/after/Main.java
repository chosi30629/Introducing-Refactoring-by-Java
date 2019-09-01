package _01_magicnumbertoconstant.advanceexample.after;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot("seongil");

        robot.order(Command.WALK);
        robot.order(Command.STOP);
        robot.order(Command.JUMP);
    }

}
