import java.util.ArrayList;

public class Cart {
    int id, numberOfProducts;
    int price, total;
    ArrayList<Products> products = new ArrayList<Products>();

    
    public Cart(int id, int numberOfProducts, int price, int total, ArrayList<Products> products) {
        this.id = id;
        this.numberOfProducts = numberOfProducts;
        this.price = price;
        this.total = total;
        this.products = products;
    }
    public Cart(int id){
        this.id = id;

    }
    public Cart(){
        
    }
    
    public int getId() {
        return id;
    }
   
    public int getNumberOfProducts() {
        return products.size();
    }
 
    
    public int getPrice(Products product) {
        for(Products i: products){
            if(i.getId() == product.getId())
            return i.getPrice();
        }
        return 0;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getTotal() {
        int tot = 0;
        for(Products i :  products){
            tot +=i.getPrice();
        }
        return tot;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public ArrayList<Products> getProducts() {
        return products;
    }
    public void addProducts(Products product) {
        products.add(product);
    }
    public boolean getProductbyId(int id){
        for(Products i : products){
            if(i.getId() == id) return true;
        }
        return false;
    }

    public void emptyCart(){
        products.clear();
    }
    public void deleteFromCart(int id){
        for(Products i: products){
            if(i.getId() == id){
              products.remove(i);
              break;
            }
                 
        }
    }

}
