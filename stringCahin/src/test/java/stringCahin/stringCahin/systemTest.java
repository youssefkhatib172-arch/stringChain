package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class systemTest {

    // בדיקת מערכת – כל השרשרת A→E
    @Test
    public void testWholeChain_EmptyPrefix() {
        E e = new E();
        D d = new D(e);
        C c = new C(d);
        B b = new B(c);
        A a = new A(b);

        String result = a.process("");
        assertEquals("HELLO", result);
    }
}
