public class Payment {
    int customerId;
    
    String name, cardType, cardNo;

    public Payment(int customerId, String name, String cardType, String cardNo) {
        this.customerId = customerId;
        this.name = name;
        this.cardType = cardType;
        this.cardNo = cardNo;
    }
    public Payment(int id){
        this.customerId = id;
    }
    public Payment(){
        
    }
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    
    public void makePayment(int totalPrice){
        System.out.println(" Total Price to paid : " + totalPrice);
    
    }
    
}