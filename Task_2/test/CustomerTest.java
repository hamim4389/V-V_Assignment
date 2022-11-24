import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    static Customer customer;

    @BeforeAll
    static void init(){
             customer = new Customer( "AAA","XYZ", "010101");
    }
    @Test
    void testAddToCart() {
        customer.cart.emptyCart();
        Products pr = new Products("Apple", 100, "Food", "Fruits");
        int expectedId = pr.getId();
        customer.addToCart(pr);
        boolean f = customer.cart.getProductbyId(expectedId);
        assertTrue(f);
        
            
    }

    @Test
    void testBuyProducts() {

    }

    @Test
    void testDeletefromCart() {
      customer.cart.emptyCart();
        Products pr = new Products("Apple", 100, "Food", "Fruits");
        Products pr1 = new Products("Banana", 101, "Food", "Fruits");
        int expectedId = pr1.getId();
        customer.addToCart(pr);
        customer.addToCart(pr1);
        customer.deletefromCart(pr1.getId());
        boolean f = customer.cart.getProductbyId(expectedId);
        assertFalse(f);
        
             
    }

    @Test
    void testGetAddress() {
      assertEquals("XYZ", customer.getAddress());
    }

    @Test
    void testGetId() {
              assertEquals(1, customer.getId());
    }

    @Test
    void testGetName() {
         assertEquals("AAA", customer.getName(), "Testing GetName form Customer");
    }

    @Test
    void testGetPhnNo() {
        assertEquals("010101", customer.getPhnNo(), "Testing GePhone No form Customer");
    }

   
}
