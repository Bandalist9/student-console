package algorithm;

public class Sol_011 {
    public String solution(int num) {
        if (num == 0) return "Even";

        return (Math.abs(num) % 2 == 1) ? "Odd" : "Even";
    }
}
