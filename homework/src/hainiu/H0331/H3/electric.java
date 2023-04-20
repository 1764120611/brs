package hainiu.H0331.H3;

public class electric extends car implements dangWei{
    private int kilometre;

    @Override
    public void fuel() {
        System.out.println("电动车当然充电啊");
    }

    public electric() {
    }

    public electric(String brand, String series, double price, String colour, int kilometre) {
        super(brand, series, price, colour);
        this.kilometre = kilometre;
    }

    public int getKilometre() {
        return kilometre;
    }

    public void setKilometre(int kilometre) {
        this.kilometre = kilometre;
    }

    @Override
    public void dangwei() {
        System.out.println("电动车大多都是自动挡的");
    }

    @Override
    public String toString() {
        return "该车是"+getBrand()+"的"+getSeries()+"车型，可以用电跑"+kilometre+"公里。价格是"+getPrice()+"元";
    }
}
