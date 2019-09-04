package _10_replaceerrorcodewithexception.example.advanceafter;


import java.util.HashMap;
import java.util.Map;


public abstract class Command {
    /**
     * 중첩클래스를 통한 분류 코드를 상태/전략 패턴으로 치환 리팩토링을 했다.
     *  - 이 리팩토링은 다 좋은데 알고 보니 Forward, Backward, Right, Left 라는 클래스가 늘어나 버렸다.
     *  - 이런 클래스는 인스턴스를 하나만 가지므로 다음처럼 익명 클래스를 쓰면 좀 더 단순하게 작성할 수 있다.
    public static final Command FORWARD = new Forward();
    public static final Command BACKWARD = new Backward();
    public static final Command TURN_RIGHT = new Right();
    public static final Command TURN_LEFT = new Left();
     */
    // 익명 클래스로 싱글톤 패턴을 구현
    public static final Command FORWARD = new Command("forward") {
        @Override
        public void execute(Robot robot) {
            robot.forward();
        }
    };
    public static final Command BACKWARD = new Command("backward") {
        @Override
        public void execute(Robot robot) {
            robot.backward();
        }
    };
    public static final Command TURN_RIGHT = new Command("right") {
        @Override
        public void execute(Robot robot) {
            robot.right();
        }
    };
    public static final Command TURN_LEFT = new Command("left") {
        @Override
        public void execute(Robot robot) {
            robot.left();
        }
    };
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


    protected Command(String name) {
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

    public abstract void execute(Robot robot);

    /**
    // 중첩 클래스

    private static class Forward extends Command {
        public Forward() {
            super("forward");
        }

        @Override
        public void execute(Robot robot) {
            robot.forward();
        }
    }

    private static class Backward extends Command {
        public Backward() {
            super("backward");
        }

        @Override
        public void execute(Robot robot) {
            robot.backward();
        }
    }

    private static class Right extends Command {
        public Right() {
            super("right");
        }

        @Override
        public void execute(Robot robot) {
            robot.right();
        }
    }

    private static class Left extends Command {
        public Left() {
            super("left");
        }

        @Override
        public void execute(Robot robot) {
            robot.left();
        }
    }
    */

}
