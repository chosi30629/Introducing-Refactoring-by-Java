package removecontrolflag02.findint.after;


public class FindInt {

    /*
    public static boolean find(int[] data, int target) {
        // 변수명 변경
        boolean found = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                // found 에 '찾았음'을 표현 후 break
                found = true;
                break;
            }
        }
        return found;
    }
    */

    /**
     * break 로 리팩토링을 마친 코드를 다시 리팩토링
     * 메서드 안에 return 이 두 개 있어서 출구가 두 개이다.
     * 개발자 중에는 메서드 출구는 반드시 하나여야 한다고 믿는 사람도 있다.
     * 하지만 메서드 출구를 늘 하나만 두는 건 현실적이지 않다.
     * 출구를 하나로 고정하면 '찾았다'라는 상태를 출구까지 가지고 가는 변수가 필요하다.
     * 하지만 입구는 하나지만 출구는 여러 개 있어도 된다고 생각하면 변수를 줄일 수 있으므로 코드가 깔끔해지는 경우가 많다.
     */
    public static boolean find(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }
        return false;
    }

}
