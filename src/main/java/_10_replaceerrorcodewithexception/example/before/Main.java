package _10_replaceerrorcodewithexception.example.before;


public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot("seongil");
        System.out.println(robot.toString());

        robot.execute("forward right forward");
        System.out.println(robot.toString());

        robot.execute("left backward left forward");
        System.out.println(robot.toString());

        robot.execute("right forward forward farvard"); // 마지막 단어는 일부러 한 실수
        System.out.println(robot.toString());
    }

}
