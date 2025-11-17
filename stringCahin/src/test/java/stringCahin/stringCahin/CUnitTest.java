package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class CUnitTest {

    // בדיקת יחידה 2 – C עם Stub ל-D
    @Test
    public void testC_WithDStub_AddsLThenX() {
        C c = new C(new DStub());
        String out = c.process("HE");
        assertEquals("HELX", out);  // HE + L (C) + X (Stub)
    }
}
