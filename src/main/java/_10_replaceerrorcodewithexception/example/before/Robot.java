package _10_replaceerrorcodewithexception.example.before;


import java.util.StringTokenizer;


public class Robot {
    private final String name;
    private final Position position = new Position(0, 0);
    private final Direction direction = new Direction(0, 1);


    public Robot(String name) {
        this.name = name;
    }


    public void execute(String commandSequence) {
        StringTokenizer tokenizer = new StringTokenizer(commandSequence);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (!excuteCommand(token)) {
                System.out.println("Invalid command: " + token);
                break;
            }
        }
    }

    public boolean excuteCommand(String commandString) {
        Command command = Command.parseCommand(commandString);

        // 에러 전파
        if (command == null) {
            return false;
        }

        return executeCommand(command);
    }

    public boolean executeCommand(Command command) {
        if (command == Command.FORWARD) {
            position.relativeMove(direction.x, direction.y);
        } else if (command == Command.BACKWARD) {
            position.relativeMove(-direction.x, -direction.y);
        } else if (command == Command.TURN_RIGHT) {
            direction.setDirection(direction.y, -direction.x);
        } else if (command == Command.TURN_LEFT) {
            direction.setDirection(-direction.y, direction.x);
        } else {    // 에러 전파
            return false;
        }
        return true;
    }

    public String toString() {
        return "[ Robot: " + name + " "
                + "position(" + position.x + ", " + position.y + "), "
                + "direction(" + direction.x + ", " + direction.y + ") ]";
    }

}
