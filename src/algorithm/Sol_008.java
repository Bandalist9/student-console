package algorithm;

public class Sol_008 {
    public int solution(int angle) {
        if (angle == 90 || angle == 180) {
            return angle == 90 ? 2 : 4;
        }

        return angle < 90 ? 1 : 3;
    }
}
