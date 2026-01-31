public class b3 {
    private String productId;
    private String productName;
    private double price;
    public b3(String productId, String productName, double price){
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }
    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public double setPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Gía không hợp lệ");
        }
    }
    public void dispaly(){
        System.out.println("Mã sp: " + productId);
        System.out.println("Tên sp: " + productName);
        System.out.println("Gía sp: " + price);
    }
    public static void main(String[] args) {
        b3 name = new b3("SP01", "Laptop", 15000000);

        name.dispaly();
        name.setPrice(-100);
//        System.out.println();
//        name.dispaly();
//        System.out.println();
//        name.setPrice(16000000);
//        name.dispaly();
    }
}
