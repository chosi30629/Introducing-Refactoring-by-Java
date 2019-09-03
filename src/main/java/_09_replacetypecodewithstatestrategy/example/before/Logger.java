package _09_replacetypecodewithstatestrategy.example.before;


public class Logger {
    public static final int STATE_STAPPED = 0;
    public static final int STATE_LOGGING = 1;

    private int state;


    public Logger() {
        this.state = STATE_STAPPED;
    }


    public void start() {
        switch (state) {
            case STATE_STAPPED:
                System.out.println("** START LOGGING **");
                state = STATE_LOGGING;
                break;
            case STATE_LOGGING:
                /* 아무것도 하지 않음 */
                break;
            default:
                System.out.println("Invalid state: " + state);
        }
    }

    public void stop() {
        switch (state) {
            case STATE_STAPPED:
                /* 아무것도 하지 않음 */
                break;
            case STATE_LOGGING:
                System.out.println("** STOP LOGGING **");
                state = STATE_STAPPED;
                break;
            default:
                System.out.println("Invalid state: " + state);
        }
    }

    public void log(String info) {
        switch (state) {
            case STATE_STAPPED:
                System.out.println("Ignoring: " + info);
                break;
            case STATE_LOGGING:
                System.out.println("Logging: " + info);
                break;
            default:
                System.out.println("Invalid state: " + state);
        }
    }

}
