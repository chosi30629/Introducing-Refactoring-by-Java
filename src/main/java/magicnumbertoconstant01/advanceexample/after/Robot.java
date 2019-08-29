package magicnumbertoconstant01.advanceexample.after;


public class Robot {
    private final String name;


    public Robot(String name) {
        this.name = name;
    }


    public void order(Command command) {
        if (command == Command.WALK) {
            System.out.println(name + " walks.");
        } else if (command == Command.STOP) {
            System.out.println(name + " stops.");
        } else if (command == Command.JUMP) {
            System.out.println(name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }

}
