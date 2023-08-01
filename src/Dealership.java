public class Dealership {
    public static void main(String[] args){
        Customer cust1 = new Customer();
        cust1.setName("Gabriel");
        cust1.setAddress("Sé - 123");
        cust1.setCashOnHand(12000);

        Vehicle vehicle1 = new Corsa();
        vehicle1.setColor("Rosa");
        vehicle1.setPrice(9000);
        vehicle1.setYear(2000);

        Employe emp = new Employe();

        cust1.purchaseCar(vehicle1, emp, false);


    }
}
