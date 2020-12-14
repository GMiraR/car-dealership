public class Customer {

    private String name;
    private String address;
    private String profession;
    private double cash;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    public String getProfession(){
        return profession;
    }


    public void setCash(double cash){
        this.cash = cash;
    }

    public double getCash(){
        return cash;
    }

    public static String purchaseCar(Vehicle vehicle, Employee employee){
        return " You've just bought a brand new " + vehicle.getCar() + ". Congrats!" + " The salesman is " + employee.getEmployee();

    }
}
