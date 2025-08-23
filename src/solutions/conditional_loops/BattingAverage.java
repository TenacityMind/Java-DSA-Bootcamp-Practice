package solutions.conditional_loops;

public class BattingAverage {
    public static double battingAverage(int runs, int totalMatchesPlayed, int totalMatchesNotOut) {
        double battingAverage;

        battingAverage = (double) runs/(totalMatchesPlayed-totalMatchesNotOut);

        return battingAverage;
    }
    public static void main(String[] args) {
        System.out.println(battingAverage(10000, 250, 50));
    }
}
