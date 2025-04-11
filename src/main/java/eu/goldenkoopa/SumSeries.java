package eu.goldenkoopa;

public class SumSeries {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%2d", i) + ", " + sumSeries(i));
        }
    }

    private static double sumSeries(int i) {

        if (i < 1) {
            return 0;
        }

        return 1f / i + sumSeries(i - 1);
    }

}
