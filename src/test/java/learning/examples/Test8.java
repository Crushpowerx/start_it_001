package learning.examples;


import org.testng.annotations.Test;

import java.util.Arrays;

public class Test8 {

    @Test
    public void test1() {
        int[] arrayInt = new int[5];
        try {
            for (int i = 0; i < 6; i++) {
                arrayInt[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException ignore) {
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}
