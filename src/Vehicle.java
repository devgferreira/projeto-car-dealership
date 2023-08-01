public class Vehicle {

    protected String Model;
    protected String Color;
    protected int Year;
    protected double Price;

    public Vehicle(String model, String color, int year, double price) {
        Model = model;
        Color = color;
        Year = year;
        Price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Model='" + Model + '\'' +
                ", Color='" + Color + '\'' +
                ", Year=" + Year +
                ", Price=" + Price +
                '}';
    }
}
