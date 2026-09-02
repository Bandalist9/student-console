package algorithm;

public class Sol_014 {
    public int solution(int n) {
        int sum = 0;

        for (int i= 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum + n;
    }
}
