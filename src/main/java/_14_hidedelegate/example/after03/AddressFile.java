package _14_hidedelegate.example.after03;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;


public class AddressFile {
    private final Database database;


    public AddressFile(String filename) {
        database = new Database(filename);
    }


    public Enumeration names() {
        return database.keys();
    }

    public void set(String key, String value) {
        database.set(key, value);
    }

    public String get(String key) {
        return database.get(key);
    }

    public void update() throws IOException {
        database.update();
    }


    /**
     * 중첩 클래스를 사용한 은폐
     *  - 중첩 클래스란 클래스 내부에 선언한 클래스를 의미하며, 클래스끼리 관계가 있다는 걸 코드로 명시하는 효과가 있다.
     *  - AddressFile 클래스 내부에 중첩 클래스로 Database 클래스를 선언할 수 있다.
     *    이렇게 private static class 로 Database 를 선언하면 Database 클래스는 AddressFile 클래스 내부에서만
     *    사용하는 클래스가 된다.
     */
    private static class Database {
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

        public Enumeration keys() {
            return properties.propertyNames();
        }
    }

}
