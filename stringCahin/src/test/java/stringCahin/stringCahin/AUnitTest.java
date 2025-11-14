// AUnitTest.java
package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class AUnitTest {
    @Test
    public void testA_AddsH_Only() {
        A a = new A(new BStopStub());
        String out = a.process("");
        assertEquals("HE", out);
    }

    @Test
    public void testA_NullInput_TreatedAsStringNull() {
        A a = new A(new BStopStub());
        String out = a.process(null);
        assertEquals("nullHE", out); // כי null + "H" == "nullH"
    }
}
