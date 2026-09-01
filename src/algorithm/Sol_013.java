package algorithm;

public class Sol_013 {
    public int solution(int n) {
        int length = String.valueOf(n).length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
