public class Dealership {
    public static void main(String[] args){
        Customer cust1 = new Customer("Gabriel", "Sé - 123", 10000);


        Vehicle vehicle = new Vehicle("Corsa","Rosa", 2002, 9000);
        Employe emp = new Employe();

        cust1.purchaseCar(vehicle, emp, false);


    }
}
