package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class AUnitTest {

    // בדיקת יחידה 1 – A עם Stub ל-B
    @Test
    public void testA_AddsH_Only() {
        A a = new A(new BStopStub()); // Stub ל-B
        String out = a.process("");
        assertEquals("HE", out);      // H (A) + E (מה-Stub)
    }
}
