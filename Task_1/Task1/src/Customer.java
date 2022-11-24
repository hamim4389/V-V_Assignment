import java.util.ArrayList;

public class Customer {
    
    int id;
    String name, address, phnNo;
    static int customerCounter = 1;
    Cart cart;
    Payment pay ;
    
    

    public Customer(String name, String address, String phnNo) {
        this.id = customerCounter;
        this.name = name;
        this.address = address;
        this.phnNo = phnNo;
        customerCounter++;

        cart = new Cart(this.id);
        pay = new Payment(this.id);

        System.out.println("Customer Created with id "+ id + " and name " + name );
        
    }
    public Customer(){}
    
    public int getId() {
        return id;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }
    
    /// Going to be done by the Customer

   

    public void buyProducts() {
        System.out.println("Buying Products needs to make payment\n");
        pay.makePayment(cart.getTotal());
    }
        
        
    public void viewProducts() {
        System.out.println("Viewing the Cart\n");
        ArrayList<Products> products = cart.getProducts();

        for(Products i :  products){
            System.out.println(i + "\n");
        }
    }
   
    public void addToCart(Products product) {
       
    cart.addProducts(product);
    System.out.println("product name " + product.getName() +" added to Cart ");
                  
                
        
    }
    public void deletefromCart(int id){
            cart.deleteFromCart(id);
    }

}

