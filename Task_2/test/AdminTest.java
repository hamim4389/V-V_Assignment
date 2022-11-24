import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AdminTest {
    static Admin aAdmin;
    @BeforeAll
    static void init(){
        aAdmin = new Admin();
        
    }
    @Test
    void testAddProducts() {
        int expectedSize = aAdmin.getProducts().size() + 3;

        aAdmin.addProducts(new Products("Apple", 100, "Food", "Fruits"));
        aAdmin.addProducts(new Products("Orange", 101, "Food", "Fruits"));
        aAdmin.addProducts(new Products("Banana", 103, "Food", "Fruits"));

        int actualSize = aAdmin.getProducts().size();

        assertEquals("testing Add products for Admin ", expectedSize, actualSize);

    }

    @Test
    void testDeleteProducts() {
        aAdmin.emptyList();
        Products product1 = new Products("Banana", 103, "Food", "Fruits");
        Products product2 = new Products("Apple", 100, "Food", "Fruits");
        aAdmin.addProducts(product1);
          aAdmin.addProducts(product2);

        int expectedSize = aAdmin.getProducts().size() - 1;
        
          
          
         aAdmin.deleteProducts(product1);
         
        

        int actualSize = aAdmin.getProducts().size();

        assertEquals("testing delete products for Admin ", expectedSize, actualSize);
    }

    @Test
    void modifyProducts(){
        aAdmin.emptyList();
        Products product1 = new Products("Ban", 103, "Food", "Fruits");
        aAdmin.addProducts(product1);
        int id = product1.getId();
        System.out.println("id = " + id +", Name = " + aAdmin.getProductById(id).getName());

        aAdmin.modifyProducts(id, "AAAA", "Food", "Fruits", 103);

             String expectedName = "AAAA";
             
             String actualName = aAdmin.getProductById(id).getName();
             assertEquals(expectedName, actualName);
    }

    @Test
    void testGetProducts() {
           
    }

    @Test
    void testViewProducts() {

    }
}
