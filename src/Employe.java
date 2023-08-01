public class Employe {
    private String name;

    public void handleCustomer(Customer cust, boolean finace, Vehicle vehicle){
        if(finace == true){
            double amount = vehicle.getPrice() -cust.getCashOnHand();
             runCreditHistory(cust, amount);
        }else if(vehicle.getPrice() <= cust.getCashOnHand()){
            processTransaction(cust,  vehicle);
        }else{
            System.out.println("Você precisa de mais dinheiro");
        }
    }
    public void runCreditHistory(Customer cust, double amount){
        System.out.println("Ran credit history for Customer...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }

    public static Object processTransaction(Customer cust, Vehicle vehicle){
        Object result = System.out.printf("Querido: %s Sua compra deu: %s%n", cust.getName(), vehicle.getPrice());
        return result;
    }
}
