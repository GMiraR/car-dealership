public class Financial {

    public boolean approveFinance(double cash, double carPrice){
        if (cash > (carPrice * 0.3)){
            return true;
        }
        return false;
    }

}
