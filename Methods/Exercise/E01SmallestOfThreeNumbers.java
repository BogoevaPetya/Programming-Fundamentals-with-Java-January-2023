package Fundamentals.Methods.Exercise;

import java.util.Scanner;

public class E01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        isSmallestNumber(number1, number2, number3);
    }

    public static void isSmallestNumber(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            System.out.print(n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.print(n2);
        } else {
            System.out.print(n3);
        }
    }
}
