public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    Admin admin = new Admin("Hamim");
    Products product1,product2, product3;
    product1 = new Products("A", 10, "food", "fruits");
    product2 = new Products( "B", 100, "food", "fruits");
    product3 = new Products("X", 1100, "food", "fruits");

    admin.addProducts(product1);
    admin.addProducts(product2);
    admin.addProducts(product3);

    //admin.viewProducts();
    //admin.deleteProducts(product3);
    //admin.addProducts(product3);

    Customer cus1 = new Customer( "Hasib", "XYZ", "012126");

    Products product4 = new Products("XY", 1100, "food", "fruits");
    
    cus1.addToCart(product4);
    cus1.addToCart(product3);
    cus1.addToCart(product2);
    cus1.viewProducts();
    cus1.buyProducts();
    }
}
