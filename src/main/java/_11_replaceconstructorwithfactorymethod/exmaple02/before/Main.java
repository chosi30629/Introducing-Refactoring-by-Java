package _11_replaceconstructorwithfactorymethod.exmaple02.before;


public class Main {

    public static void main(String[] args) {
        new Client(false).execute();
        new Client(true).execute();
    }

}
