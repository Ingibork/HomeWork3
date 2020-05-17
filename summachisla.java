package summachisla;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */
public class summachisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int result = calculate(number);
        System.out.println(result);

        }

        public static int calculate (int number) {
            int sum = 0;
            int values;
            for (int i = 0; 0 < number; ) {
                values = number % 10;
                sum = sum + values;
                number /= 10;
        }

            return sum;


    }

}





