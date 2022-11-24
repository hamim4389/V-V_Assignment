public class Products {

    static int productCounter = 1;
    private int id,price;
    String name, group, subGroup;

   
    public Products(String name, int price, String group, String subGroup){
        this.id = productCounter;
        this.name = name;
        this.group = group;
        this.subGroup = subGroup;
        this.price = price;
        productCounter++;
    }
    public Products(){

    }

    public int getId() {
        return this.id;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getSubGroup() {
        return subGroup;
    }
    public void setSubGroup(String subGroup) {
        this.subGroup = subGroup;
    }
    
}
