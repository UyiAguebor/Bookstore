//import to be included
import java.time.LocalDate;
public class Shipping{
    Order object;
    LocalDate shipDate;
    private double shipCost;
    public static int countUrgent;

    public Shipping(Order object,LocalDate shipDate) {
    this.object = object;
    this.shipDate =shipDate;
    }

    public LocalDate getShipDate() {
        return shipDate;
    }

    public double getShipCost() {
        return shipCost;
    }

    public void setShipCost(double shipCost) {
        this.shipCost = shipCost;
    }

    public double calcShipCost(boolean isUrgent){
       if (isUrgent){
           return shipCost = 5.45;} else {
           return shipCost = 3.95;}
       }
    }
