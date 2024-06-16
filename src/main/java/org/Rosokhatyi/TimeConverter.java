package org.Rosokhatyi;

//У Діда Мороза є годинник, який показує, скільки секунд залишилося до кожного Нового року.
// Оскільки Дід Мороз вже літній чоловік,
// тому деякі математичні операції він не спроможний виконувати швидко.
// Допоможіть Діду Морозу визначити,
// скільки повних днів, годин, хвилин і секунд залишилося до наступного Нового року,
// якщо відомо, скільки залишилося секунд.
// Тобто , розподіліть час в секундах на повну кількість днів, годин, хвилин і секунд.
// Виведіть результат в консоль.
// Наприклад, як має виглядати виведення результату: 10 днів, 14 годин, 5 хвилин і 33 секунди

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість секунд, що залишилася до Нового року: ");
        long totalSeconds = scanner.nextLong();

        convertSecondsToTime(totalSeconds);
    }

    public static void convertSecondsToTime(long totalSeconds) {
        long days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);

        long hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        System.out.println(days + " днів, " + hours + " годин, " + minutes + " хвилин і " + seconds + " секунд.");
    }
}

