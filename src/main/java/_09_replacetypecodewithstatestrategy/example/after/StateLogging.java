package _09_replacetypecodewithstatestrategy.example.after;


public class StateLogging extends State {

    @Override
    public int getTypeCode() {
        return Logger.STATE_LOGGING;
    }
}
