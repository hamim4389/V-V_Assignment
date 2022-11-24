import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    static Payment pay;
    @BeforeAll
    static void init(){
        pay = new Payment(1, "AAA", "Online", "11111");
    }
    @Test
    void testGetCardNo() { 
       assertEquals("11111", pay.getCardNo(), "Testing Get Card method from Payment");
    }

    @Test
    void testGetCardType() {
        assertEquals("Online", pay.getCardType(), "Testing Get Card type method from Payment");

    }

    @Test
    void testGetCutomerId() {
        assertEquals(1, pay.getCustomerId(), "Testing Get Customer id method form Payment");
    }

    @Test
    void testGetName() {
           
        assertEquals("AAA", pay.getName(), "Testing Get Customer Name method form Payment");
           
    }

    @Test
    void testSetCutomerId() {

    }

    @Test
    void testSetName() {

    }
    
}
