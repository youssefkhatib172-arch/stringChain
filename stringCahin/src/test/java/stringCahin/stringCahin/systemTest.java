package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// System Test – כל המערכת יחד
public class systemTest {

    @Test
    public void testRunEndToEnd() {
        ChainMain runner = new ChainMain();

        String result = runner.run();

        assertEquals("HELLO", result);
    }
}
