package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

// Integration Test: C + D (E מוחלפת ב-Stub)
public class Integration_CDTest {

    @Test
    public void testIntegration_CtoD_withEStub() {
        EStub eStub = new EStub();   // Stub ל-E
        D realD = new D(eStub);      // D אמיתי
        C realC = new C(realD);      // C אמיתי

        String result = realC.process("HE");

        // C מוסיפה L ⇒ "HEL", D מוסיפה L ⇒ "HELL", EStub לא מוסיף כלום
        assertEquals("HELL", result);
    }
}
