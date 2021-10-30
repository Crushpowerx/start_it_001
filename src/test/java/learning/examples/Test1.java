package learning.examples;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    @BeforeMethod
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
