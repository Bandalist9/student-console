package algorithm;

import java.util.Arrays;

public class Sol_012 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
