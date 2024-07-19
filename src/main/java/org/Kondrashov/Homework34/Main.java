package org.Kondrashov.Homework34;

import java.util.Date;

public class Main {

//    У Діда Мороза є годинник, який показує, скільки секунд залишилося до кожного Нового року.
//    Оскільки Дід Мороз вже літній чоловік, тому деякі математичні операції він не спроможний виконувати швидко.
//    Допоможіть Діду Морозу визначити, скільки повних днів, годин, хвилин і секунд залишилося до наступного Нового року, якщо відомо, скільки залишилося секунд.
//    Тобто , розподіліть час в секундах на повну кількість днів, годин, хвилин і секунд. Виведіть результат в консоль.
//    Наприклад, як має виглядати виведення результату: 10 днів, 14 годин, 5 хвилин і 33 секунди
//
//    Завдання одне на всіх. Рішення завдання повинно буди у package з вашим прізвищем. Результат роботи треба скинути у PullRequst до проекту:
//    https://github.com/EvgeniyTtStep/Java32Idea
//    який ми зробили на занятті. У майстат закиньте посилання на ваш гіт з цим проектом.

    public static void main(String[] args) {

        Date current = new Date();

        int currentYear = current.getYear();

        Date newYear = new Date(currentYear + 1,  0, 1);

        Long untilNewYearMilisec = newYear.getTime() - current.getTime();

        System.out.println("Годинник Діда Мороза показує, що до Нового року залишилося " +  untilNewYearMilisec /1000 + " секунд.");

        Long untilNewYearDays = untilNewYearMilisec / (60*60*24*1000);
        untilNewYearMilisec = untilNewYearMilisec % (60*60*24*1000);

        Long untilNewYearHours = untilNewYearMilisec / (60*60*1000);
        untilNewYearMilisec = untilNewYearMilisec % (60*60*1000);

        Long untilNewYearMin = untilNewYearMilisec / (60*1000);
        untilNewYearMilisec = untilNewYearMilisec % (60*1000);

        Long untilNewYearSec = untilNewYearMilisec / (1000);

        System.out.println("Це складає " +  untilNewYearDays + " днів, " + untilNewYearHours + " годин, " + untilNewYearMin + " хвилин і " + untilNewYearSec + " секунд.");

    }

}
