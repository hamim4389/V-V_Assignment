import java.util.ArrayList;

public class Admin{

    private int id;
    static int adminCounter = 1;
    private String name;
    private ArrayList<Products> products = new ArrayList<>();

    Admin(String name){
        this.id = adminCounter;
        this.name = name;
        adminCounter++;

        System.out.println("Admin Created with id "+ id + " and name " + name );
    }
    Admin(){

    }
    String getAdminName(){
        return this.name;
    }
    public void viewProducts(){
        for(Products i :  products){
            System.out.println("Product name : "+ i.getName() + " Product id : " + i.getId() + " Product price : " + i.getPrice() + "\n");
        }
    }

    public ArrayList<Products> getProducts(){
       return products;
    }
    public void deleteProducts(Products product){
        products.remove(product);
        viewProducts();
    }

    public void modifyProducts(int id, String name, String group, String subGroup, int price){
        
          for(Products i : products){
             if(i.getId() == id) {
                i.setName(name);
           i.setGroup(group);
           i.setSubGroup(subGroup);
           i.setPrice(price);

             }
          }
           
    }
    
    public void addProducts(Products product){
        products.add(product);
    }

    public void emptyList(){
        products.clear();
        
    }
    public Products getProductById(int id){
        for(Products i : products){
            if(i.getId() == id) {
               return i;

            }
         }
        return null;
    }

    public void makeShipment() {}
    public void confirmDelivery() { }
}