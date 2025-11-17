package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegrationABTest {
    @Test
    public void testAtoB_WithCStopStub() {
        CStopStub cStub = new CStopStub();
        B b = new B(cStub);
        A a = new A(b);
        String out = a.process("");
        assertEquals("HEL", out); // H (A) + E (B) + L (CStub)
    }
}
