package _10_replaceerrorcodewithexception.example.after;


import java.util.HashMap;
import java.util.Map;


public class Command {
    public static final Command FORWARD = new Command("forward");
    public static final Command BACKWARD = new Command("backward");
    public static final Command TURN_RIGHT = new Command("right");
    public static final Command TURN_LEFT = new Command("left");
    private static final Map<String, Command> commandNameMap = new HashMap<String, Command>();


    /**
     * static 필드이므로 static 블록으로 초기화
     */
    static {
        commandNameMap.put(FORWARD.name, FORWARD);
        commandNameMap.put(BACKWARD.name, BACKWARD);
        commandNameMap.put(TURN_RIGHT.name, TURN_RIGHT);
        commandNameMap.put(TURN_LEFT.name, TURN_LEFT);
    }

    private final String name;


    /**
     * Command 의 public static final 필드에 선언된 인스턴스 외에는 생성하지 않음을 표현
     */
    private Command(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public static Command parseCommand(String name) throws InvalidCommandException {
        if (!commandNameMap.containsKey(name)) {
            throw new InvalidCommandException(name);
        }

        return commandNameMap.get(name);
    }

}
