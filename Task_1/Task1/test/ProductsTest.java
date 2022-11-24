import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ProductsTest {
    static Products product;

    @BeforeAll
    static void init(){
        product = new Products("Apple", 100, "Food", "Fruit");
    }
    @Test
    void testGetGroup() {
        assertEquals("Food", product.getGroup(), "Testing getGroup method form Products");
        
    } 

    @Test    void testGetId() {
        assertEquals(Products.productCounter - 1, product.getId(), "Testing getId method form Products");
    }

    @Test
    void testGetName() {

        assertEquals("Apple", product.getName(), "Testing getName method form Products");
    }

    @Test
    void testGetPrice() {
        assertEquals(100, product.getPrice(), "Testing getPrice method form Products");
    }

    @Test
    void testGetSubGroup() {
        assertEquals("Fruit", product.getSubGroup(), "Testing getSubGroup method form Products");

    }
}
