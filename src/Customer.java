public class Customer {

    private String Name;
    private String Address;
    private double CashOnHand;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        address += " Dealership City";
        Address = address;
    }

    public double getCashOnHand() {
        return CashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        CashOnHand = cashOnHand;
    }

    public void purchaseCar(Vehicle vehicle, Employe emp, boolean finance){

    }
}
