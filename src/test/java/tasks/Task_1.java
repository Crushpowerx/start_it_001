package tasks;

public class Task_1 {

    public static void main(String[] args) {
        decision1();
        System.out.println("\n");
        decision2();
        System.out.println("\n");
        decision3();
        System.out.println("\n");
        decision4();
        System.out.println("\n");
        decision5();
    }


    //    Решение раз: в первой части один цикл по добавлению к строке одного знака "*", а во второй части программы работает цикл в цикле (внешний по строкам, внутренний по столбцам)
//    и выводим звезду по убыванию. Сколько звезд добавлять в строку зависит от переменной star, которая равна 9 минус номер строки j.
    public static void decision1() {
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += "*";
            System.out.println(str);
        }

        for (int j = 0; j < 9; j++) {
            int star = 9 - j;
            for (int m = 0; m < star; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    Решение два (оптимальное): то же самое, что первый вариант, только первая часть программы - цикл в цикле (внешний по строкам, внутренний по столбцам).
    public static void decision2() {
        for (int i = 0; i < 10; i++) {
            int star = 1 + i;
            for (int o = 0; o < star; o++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j < 9; j++) {
            int star2 = 9 - j;
            for (int m = 0; m < star2; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //    Решение три: вместо разбиения программы на прорисовку двух треугольников, тут будет работать один цикл по строкам от 0 до 19,
//    внутри которого в зависимости от того какой на данный момент номер строки, будет решено по какому из внутренних циклов идти.
    public static void decision3() {
        for (int i = 0; i < 20; i++) {
            int star = 1 + i;
            if (i < 10) {
                for (int o = 0; o < star; o++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                star = 19 - i;
                for (int m = 0; m < star; m++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


    //    Решение четыре: здесь мы пошли от обратного и в первой части программы вместо добавления звезды добавляем пробелы.
    public static void decision4() {
        String star = "*";
        for (int i = 0; i < 10; i++) {
            int space = 9 - i;
            System.out.print(star);
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println();
            star = star + "*";
        }

        for (int j1 = 0; j1 < 9; j1++) {
            int star2 = 9 - j1;
            for (int m = 0; m < star2; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    Решение 5: во всех вышеперечисленных вариантах объявлять переменную star можно было не обязательно. Пример измененного кода:
    public static void decision5() {
        for (int i = 0; i < 10; i++) {
            //  int star = 1 + i;   закомментировали объявление переменной star и ее инициализацию
            for (int o = 0; o < i + 1; o++) { // в условии цикла указали до какого момента продолжать цикл - o < i + 1
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j < 9; j++) {
            //  int star2 = 9 - j;   закомментировали объявление переменной star2 и ее инициализацию
            for (int m = 0; m < 9 - j; m++) {  // в условии цикла указали до какого момента продолжать цикл - m < 9 - j
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
