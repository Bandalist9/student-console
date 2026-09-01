package algorithm;

public class Sol_009 {
    public int solution(int n) {
        int num = n / 2;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum * 2;
    }
}
