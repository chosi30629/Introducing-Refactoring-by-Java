package _09_replacetypecodewithstatestrategy.example.after;


public class StateStopped extends State{

    @Override
    public int getTypeCode() {
        return Logger.STATE_STAPPED;
    }

}
