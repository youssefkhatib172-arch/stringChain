package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegrationBCTest {
    @Test
    public void testBtoC_WithDStopStub() {
        DStopStub dStub = new DStopStub();
        C c = new C(dStub);
        B b = new B(c);
        String out = b.process("H");  // מתחילים מ-H כדי לדלג על A
        assertEquals("HEL", out);     // +E (B) +L (C), ואז ה-Stub עוצר
    }
}

