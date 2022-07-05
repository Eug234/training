package part1;
import org.testng.annotations.Test;
//if-else конструкція
//1. Написати метод який буде виводити назву тижня в залежності від введеного числа.
//Відповідно 1 - Понеділок, 2 - Вівторок, 3 - Середа, 4 - Четвер, 5 - П'ятниця, 6,7 - Вихідний. і опрацювати варіант, коли число не відповідає дню неділі.
//2. Написати метод визначення кількості днів у місяці, якщо він заданий номером від 1 до 12.
//Приклад: якщо передаємо в метод число 3 (це березень. в цьому місяці 31 день), то виводимо в консоль "В цьому місяці 31 день" (if, else if, else)
//цикл for. 3. Написати метод, що буде виводити в консоль, числа (в проміжу від 1 до 100) кратні умовному 2
@Test
public class IfElseFor {
    static int denTyzhnya = 5; //5 - приклад введеного числа
    static int dnivUmisyatsi = 1; //6 - приклад введеного числа

    public static void main(String[] args) {

        if (denTyzhnya == 1) {
            System.out.println("понеділок");
        } else if (denTyzhnya == 2) {
            System.out.println("вівторок");
        } else if (denTyzhnya == 3) {
            System.out.println("середа");
        } else if (denTyzhnya == 4) {
            System.out.println("четвер");
        } else if (denTyzhnya == 5) {
            System.out.println("п'ятниця");
        } else if (denTyzhnya == 6) {
            System.out.println("субота");
        } else if (denTyzhnya == 7) {
            System.out.println("неділя");
        } else {
            System.out.println("число не відповідає дню неділі");
        }

//2. Написати метод визначення кількості днів у місяці, якщо він заданий номером від 1 до 12.
        if (dnivUmisyatsi == 1) {
            System.out.println("В цьому місяці 31 день");
        } else if (dnivUmisyatsi == 2) {
            System.out.println("В цьому місяці 28 днів");
        } else if (dnivUmisyatsi == 3) {
            System.out.println("В цьому місяці 31 день");
        } else if (dnivUmisyatsi == 4) {
            System.out.println("В цьому місяці 30 днів");
        } else if (dnivUmisyatsi == 5) {
            System.out.println("В цьому місяці 31 день");
        } else if (dnivUmisyatsi == 6) {
            System.out.println("В цьому місяці 30 днів");
        } else if (dnivUmisyatsi == 7) {
            System.out.println("В цьому місяці 31 день");
        } else if (dnivUmisyatsi == 8) {
            System.out.println("В цьому місяці 31 день");
        } else if (dnivUmisyatsi == 9) {
            System.out.println("В цьому місяці 30 днів");
        } else if (dnivUmisyatsi == 10) {
            System.out.println("В цьому місяці 31 день");
        } else if (dnivUmisyatsi == 11) {
            System.out.println("В цьому місяці 30 днів");
        } else if (dnivUmisyatsi == 12) {
            System.out.println("В цьому місяці 31 день");
        } else {
            System.out.println("число не відповідає дню неділі");
        }
//цикл for. 3. Написати метод, що буде виводити в консоль, числа (в проміжу від 1 до 100) кратні умовному 2
        for (int chysloCyklu = 1; chysloCyklu < 100; chysloCyklu++)
            if (chysloCyklu % 2 == 0) {
                System.out.println ("числа з методу for, кратні 2: " + chysloCyklu);
            }
    }
}

