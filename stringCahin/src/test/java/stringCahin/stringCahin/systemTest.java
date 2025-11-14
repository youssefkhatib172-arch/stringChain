package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class systemTest {

    @Test
    public void testWholeChain_EmptyPrefix() {
        E e = new E(); D d = new D(e); C c = new C(d); B b = new B(c); A a = new A(b);
        assertEquals("HELLO", a.process(""));
    }

    @Test
    public void testWholeChain_WithCustomPrefix() {
        E e = new E(); D d = new D(e); C c = new C(d); B b = new B(c); A a = new A(b);
        assertEquals("ABHELLO", a.process("AB"));
    }

    @Test
    public void testChainMain_Run_EqualsManual() {
        String viaMain = new ChainMain().run();
        E e = new E(); D d = new D(e); C c = new C(d); B b = new B(c); A a = new A(b);
        String manual = a.process("");
        assertEquals(manual, viaMain);
    }
}
