package package_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test1 {

    @BeforeEach
    public void createNewApplication() throws Exception {
        throw new Exception("Aha!");
//        System.out.println("Created");
    }

    @Test
    public void test1() {
        System.out.println("Hello world!!!");
    }

    @Test
    public void test2() {
        System.out.println("Hello world!!!");
    }

    @Test
    public void test3() {
        System.out.println("Hello world!!!");
    }

}
