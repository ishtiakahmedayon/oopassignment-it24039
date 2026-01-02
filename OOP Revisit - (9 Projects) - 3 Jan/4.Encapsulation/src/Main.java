class Phone {
    private String brand;
    private double price;
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }
    
    public String getBrand() {
        return brand;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void applyDiscount(double percent) {
        price -= price * (percent / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("Samsung");
        phone.setPrice(800);
        
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Price: $" + phone.getPrice());
        
        phone.applyDiscount(10);
        System.out.println("After 10% discount: $" + phone.getPrice());
    }
}
