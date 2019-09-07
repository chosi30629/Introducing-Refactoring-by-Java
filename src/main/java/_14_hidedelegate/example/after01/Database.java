package _14_hidedelegate.example.after01;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class Database {
    private final Properties properties;
    private final String filename;


    public Database(String filename) {
        this.filename = filename;
        properties = new Properties();

        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
        }
    }


    public void set(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key, null);
    }

    public void update() throws IOException {
        properties.store(new FileOutputStream(filename), "");
    }

    public Properties getProperties() {
        return properties;
    }

}
