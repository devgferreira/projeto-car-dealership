public class Dealership {
    public static void main(String[] args){
        Customer cust1 = new Customer();
        cust1.setName("Gabriel");
        cust1.setAddress("Sé - 123");
        cust1.setCashOnHand(12000);

        Vehicle vehicle = new Corsa();
        vehicle.setColor("Rosa");
        vehicle.setPrice(9000);
        vehicle.setYear(2000);

        Vehicle vehicle1 = new Peugeot();
        vehicle.setColor("Preto");
        vehicle.setPrice(2000);
        vehicle.setYear(2002);


        Employe emp = new Employe();

        cust1.purchaseCar(vehicle, emp, false);
        cust1.purchaseCar(vehicle1, emp, true);


    }
}
