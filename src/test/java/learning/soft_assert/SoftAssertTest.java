package learning.soft_assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

    @Test
    public void checkSoftAssert() {
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertEquals("1", "2");
        softAssertion.assertEquals("2", "3");
        softAssertion.assertEquals("3", "2");
        softAssertion.assertTrue(false, "Aaaaaaa!!!");
        softAssertion.assertAll();
    }
}
