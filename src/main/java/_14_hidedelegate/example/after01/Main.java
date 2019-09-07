package _14_hidedelegate.example.after01;


import java.io.IOException;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        try {
            AddressFile file = new AddressFile("address.txt");
            file.set("seongil", "seongil@exmaple.com");
            file.set("dana", "dana@exmaple.com");
            file.set("java", "java@exmaple.com");
            file.update();

            Enumeration e = file.names();

            while (e.hasMoreElements()) {
                String name = (String)e.nextElement();
                String mail = file.get(name);
                System.out.println("name=" + name + ", mail=" + mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
