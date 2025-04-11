package eu.goldenkoopa;

import java.util.Scanner;

public class ReverseDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        reverseDisplay(input);
        System.out.println();
    }

    private static void reverseDisplay(String input) {

        if (input.length() == 0) {
            return;
        }

        reverseDisplay(input.substring(1, input.length()));

        System.out.print(input.charAt(0));
    }

}
