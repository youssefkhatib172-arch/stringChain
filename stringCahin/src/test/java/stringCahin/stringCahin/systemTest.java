package stringCahin.stringCahin;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
import org.junit.Test;

// System Test – כל המערכת יחד
public class systemTest {

    @Test
    public void testRunEndToEnd() {
        ChainMain runner = new ChainMain();

        String result = runner.run();

=======
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
>>>>>>> 01983590a31b69b48701d0767158cd8036185a92
        assertEquals("HELLO", result);
    }
}
