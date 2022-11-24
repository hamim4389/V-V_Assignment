

public class Guest {
    public void viewProducts(Admin admin){
        admin.viewProducts();
    }

    public Customer getRegistered(String name, String address, String phnNo){
        
        return new Customer(name, address, phnNo);
    }
}
