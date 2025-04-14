package eu.goldenkoopa;

public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }

        System.out.println();
        System.out.println(fibonacci(45) * 1f / fibonacci(44));

    }


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
