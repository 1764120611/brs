package hainiu.H0331.H3;

public abstract class car {
    private String brand;
    private String series;
    private double price;
    private String colour;

    public void use(){
        System.out.println("汽车都能在机动车道行驶");
    }
    public abstract void fuel();

    public car() {
    }

    public car(String brand, String series, double price, String colour) {
        this.brand = brand;
        this.series = series;
        this.price = price;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
