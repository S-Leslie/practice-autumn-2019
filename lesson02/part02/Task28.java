package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
 * Примеры:
 * а) при вводе чисел
 * -4
 * 6
 * 6
 * получим вывод
 * 2
 * <p>
 * б) при вводе чисел
 * -6
 * -6
 * -3
 * получим вывод
 * 0
 * <p>
 * в) при вводе чисел
 * 0
 * 1
 * 2
 * получим вывод
 * 2
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить количество положительных чисел в исходном наборе.
 * 4.	Если положительных чисел нет, программа должна вывести "0".
 * 5.	Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
 */

public class Task28 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите три целых числа:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int[] arr = {a, b, c};
        int count = 0;
        for (int i=0; i<3; i++){
            if (arr[i]>0){
                count++;
            }
        }
        System.out.println(count);

    }
}