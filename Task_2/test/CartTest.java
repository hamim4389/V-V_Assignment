import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CartTest {
    static Cart cart;
    @BeforeAll
    static void init(){
        cart = new Cart(1);
    }
    
    @Test
    void testGetId() {
        int expectedId, actualId;
        expectedId = 1;
        actualId = cart.getId();
        assertEquals(expectedId, actualId);

}

    @Test
    void testGetNumberOfProducts() {
        cart.emptyCart();
              cart.addProducts(new Products("Apple", 100, "Food", "Fruits"));
              cart.addProducts(new Products("Orange", 110, "Food", "Fruits"));

              assertEquals(2, cart.getNumberOfProducts());
    }

    @Test
    void testGetPrice() {
        cart.emptyCart();
        Products product1 = new Products("Apple", 100, "Food", "Fruits");
        cart.addProducts(product1);

        assertEquals(100, cart.getPrice(product1));
    }

    @Test
    void testGetProducts() {

    }

    @Test
    void testGetTotal() {
        cart.emptyCart();
        cart.addProducts(new Products("Apple", 100, "Food", "Fruits"));
        cart.addProducts(new Products("Orange", 110, "Food", "Fruits"));

         assertEquals(210, cart.getTotal());
    }
}
