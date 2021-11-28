package decompose;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DecomposeTest {
    Decompose1 decompose = new Decompose1();
    Decompose2 decompose2 = new Decompose2();

    @Test
    public void checkDecompose() {
        String s1 = decompose.mapping1(null);
        String s2 = decompose2.mapping2(s1);
        Assert.assertEquals("Asd_updated1_updated2", s2);
    }
}
