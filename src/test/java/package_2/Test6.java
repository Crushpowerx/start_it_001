package package_2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Test6 {

    @Test
    public void test1() {
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Element " + i;
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }

    @Test
    public void test2() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add("Element " + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayList.get(i));
        }
//        for (String s : arrayList) {
//            System.out.println(s);
//        }
    }

}
