package _10_replaceerrorcodewithexception.example.after;


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

        try {
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                excuteCommand(token);
            }
        } catch (InvalidCommandException e) {
            System.out.println("Invalid command: " + e.getMessage());
        }

    }

    public void excuteCommand(String commandString) throws InvalidCommandException {
        Command command = Command.parseCommand(commandString);
        executeCommand(command);
    }

    public void executeCommand(Command command) throws InvalidCommandException {
        if (command == Command.FORWARD) {
            position.relativeMove(direction.x, direction.y);
        } else if (command == Command.BACKWARD) {
            position.relativeMove(-direction.x, -direction.y);
        } else if (command == Command.TURN_RIGHT) {
            direction.setDirection(direction.y, -direction.x);
        } else if (command == Command.TURN_LEFT) {
            direction.setDirection(-direction.y, direction.x);
        } else {    // 에러 전파
            throw new InvalidCommandException();
        }
    }

    public String toString() {
        return "[ Robot: " + name + " "
                + "position(" + position.x + ", " + position.y + "), "
                + "direction(" + direction.x + ", " + direction.y + ") ]";
    }

}
