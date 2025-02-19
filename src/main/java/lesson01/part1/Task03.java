package lesson01.part1;

import java.util.Calendar;

public class Task03 {

    /**
     * Мой юный друг
     * Сейчас 2019 год. Наш университет основан 98 лет назад.
     * Написать программу, выводящую на экран год основания МТУСИ.
     *
     * Требования:
     * 1. Программа должна выводить текст.
     * 2. Выведенный год должен состоять из 4 цифр.
     * 3. Выведенный год должен начинаться с "19".
     * 4. Выведенный год должен соответствовать заданию.
     */

    public static void main(String[] args) {
        /*Напишите здесь ваш код
        int year = 2019 - 98;
        System.out.println(year);
        или еще проще :D
        System.out.println("1921");
        ну а если серьезно, то*/
        Calendar calendar = Calendar.getInstance();
        int Year = calendar.get(Calendar.YEAR);
        System.out.println(Year - 98);

    }
}
