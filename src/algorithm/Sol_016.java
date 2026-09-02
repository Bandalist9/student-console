package algorithm;

import java.util.Scanner;

public class Sol_016 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (1 + i);
        }

        return answer;
    }
}
