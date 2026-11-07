package uk.ac.westminster.productsapi;

public class PhysicalProduct extends Product implements Discountable{
    private double weightKG;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, double price, double weightKG, String dimensions){
        super(id, name, price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return "Name: " + getName() + " | Price: " + getPrice() + "| Weight: " + weightKG + "| Dimensions: " + dimensions;
    }

    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - Math.min(rate, 0.20));
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
