public class Vehicle {

    private String car;
    private String color;
    private double carPrice;

    public void setCar(String car, String color){
        this.car = car;
        this.color = color;
    }

    public String getCar(){
        return color + " " + car;
    }


    public void setCarPrice(double carPrice){
        this.carPrice = carPrice;
    }

    public double getCarPrice(){
        return carPrice;
    }

}
