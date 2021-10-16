package package_2;

import package_1.Class1;

public class Test3 extends Class1 {

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.method1("some text");
    }

    public void test3() {
        method1("some text");
    }
}
