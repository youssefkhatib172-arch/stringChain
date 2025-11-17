package stringCahin.stringCahin;
<<<<<<< HEAD
import org.junit.Test;
import static org.junit.Assert.*;
//Unit Test for Class A
public class AUnitTest {
 @Test
 public void testAWithStub() {
     BStub bStub = new BStub();
     A a = new A(bStub);
     String result = a.process("");
     assertEquals("H", result);
 } }



=======

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
>>>>>>> 01983590a31b69b48701d0767158cd8036185a92
