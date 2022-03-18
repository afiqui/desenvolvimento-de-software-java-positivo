package chair;
public class Chair {

    private String color;  
    private float size;
    private String company;
    private String material;
    private double price;

    public Chair(String color, float size, String company, String material, double price) {
        this.color = color;
        this.size = size;
        this.company = company;
        this.material = material;
        this.price = price;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
