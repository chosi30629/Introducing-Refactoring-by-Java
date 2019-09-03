package _09_replacetypecodewithstatestrategy.example.after;


public class Logger {
    public static final int STATE_STAPPED = 0;
    public static final int STATE_LOGGING = 1;

    private State state;


    public Logger() {
        setState(STATE_STAPPED);
    }


    public int getState() {
        return state.getTypeCode();
    }

    public void setState(int state) {
        switch (state) {
            case STATE_STAPPED:
                this.state = new StateStopped();
                break;
            case STATE_LOGGING:
                this.state = new StateLogging();
                break;
            default:
                System.out.println("Invalid state: " + state);
        }
    }

    public void start() {
        switch (getState()) {
            case STATE_STAPPED:
                System.out.println("** START LOGGING **");
                setState(STATE_LOGGING);
                break;
            case STATE_LOGGING:
                /* 아무것도 하지 않음 */
                break;
            default:
                System.out.println("Invalid state: " + getState());
        }
    }

    public void stop() {
        switch (getState()) {
            case STATE_STAPPED:
                /* 아무것도 하지 않음 */
                break;
            case STATE_LOGGING:
                System.out.println("** STOP LOGGING **");
                setState(STATE_STAPPED);
                break;
            default:
                System.out.println("Invalid state: " + getState());
        }
    }

    public void log(String info) {
        switch (getState()) {
            case STATE_STAPPED:
                System.out.println("Ignoring: " + info);
                break;
            case STATE_LOGGING:
                System.out.println("Logging: " + info);
                break;
            default:
                System.out.println("Invalid state: " + getState());
        }
    }

}
