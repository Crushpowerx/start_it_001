package learning.examples;

public class Test5 {
    public static void main(String[] args) {
        transferTypesAndPrint("text", 12345);
        transferTypesAndPrint2("5", 10);
    }

    public static void transferTypesAndPrint(String text, int number) {
        String a = text;
        String b = String.valueOf(number);
        String c = Integer.toString(number);
        System.out.println("a: " + a + "\n" + "b: " + b + "\n" + "c: " + c);
    }

    public static void transferTypesAndPrint2(String text, int number) {
        int a = Integer.parseInt(text);
        int b = number;
        int c = a + b;
        System.out.println("a + b = " + a + b);
        System.out.println("a + b = " + c);
    }
}
