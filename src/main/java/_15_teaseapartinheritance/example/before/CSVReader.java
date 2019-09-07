package _15_teaseapartinheritance.example.before;


import java.io.IOException;
import java.util.regex.Pattern;


public abstract class CSVReader {
    protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");


    protected CSVReader() {

    }

    public abstract String[] readCSV() throws IOException;
    public abstract void close() throws IOException;

}
