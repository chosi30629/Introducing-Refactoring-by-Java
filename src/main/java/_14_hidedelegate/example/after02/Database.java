package _14_hidedelegate.example.after02;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
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


    /**
     * propertyNames 라는 메서드명은 java.util.Properties 클래스라면 적절하지만, Database 클래스라면 부적절하기
     * 때문에 메서드명을 keys 로 함.
     */
    public Enumeration keys() {
        return properties.propertyNames();
    }

}
