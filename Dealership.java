public class Dealership {

    public static void main(String[] args){

        Customer cust1 = new Customer();
        cust1.setName("Guilherme de Mira");
        cust1.setAddress("1st Avenue, New York.");
        cust1.setProfession("Software Engineer");
        cust1.setCash(50_000);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setCar("Honda Civic", "Black");
        vehicle1.setCarPrice(80_000);

        Financial financialStatus = new Financial();

        Employee employee1 = new Employee();
        employee1.chooseEmployee("Frodo de Mira");

        handleSale(cust1, financialStatus, vehicle1, employee1);

    }

    public static void handleSale(Customer customer, Financial financeStatus, Vehicle vehicle, Employee employee){
        if(financeStatus.approveFinance(customer.getCash(), vehicle.getCarPrice())){
            System.out.println("Incredible, " + customer.getName() + "." + customer.purchaseCar(vehicle, employee));
        } else {
            System.out.println("Unfortunately you aren't able to buy this car.");
        }
    }
}
