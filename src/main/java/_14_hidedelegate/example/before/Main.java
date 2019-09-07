package _14_hidedelegate.example.before;


import java.io.IOException;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        try {
            AddressFile file = new AddressFile("address.txt");
            file.getDatabase().set("seongil", "seongil@exmaple.com");
            file.getDatabase().set("dana", "dana@exmaple.com");
            file.getDatabase().set("java", "java@exmaple.com");
            file.getDatabase().update();

            Enumeration e = file.names();

            while (e.hasMoreElements()) {
                String name = (String)e.nextElement();
                String mail = file.getDatabase().get(name);
                System.out.println("name=" + name + ", mail=" + mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
