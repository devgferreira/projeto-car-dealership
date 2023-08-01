public class Employe {
    private String name;

    public void handleCustomer(Customer cust, boolean finace, Vehicle vehicle){
        if(finace == true){
            double amount = vehicle.getPrice() -cust.getCashOnHand();
             runCreditHistory(cust, amount);
        }else if(vehicle.getPrice() <= cust.getCashOnHand()){
            processTransaction(cust,  vehicle);
        }else{
            System.out.println("Customer will need more money to purchase vehicle: " + vehicle);
        }
    }
    public void runCreditHistory(Customer cust, double amount){
        System.out.println("Ran credit history for Customer...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle: " + vehicle+ "for the price: " + vehicle.getPrice());
    }
}
