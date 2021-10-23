package package_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        Scanner console = new Scanner(System.in);

// ввод строк с клавиатуры
        String[] list = new String[3];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter value: ");
            String s = console.nextLine();
            list[i] = s;
        }

// вывод содержимого массива на экран
        for (int i = 0; i < list.length; i++) {
            int j = list.length - i - 1;
            System.out.println(list[j]);
        }
    }


    public static void test2() {
        Scanner console = new Scanner(System.in);

// ввод строк с клавиатуры
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter value: ");
            String s = console.nextLine();
            list.add(s);
        }

// вывод содержимого коллекции на экран
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }

}
