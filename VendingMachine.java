import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }
    public Сhocolate getCocolate(String brand, boolean availabilityOfMilk){
        for (Product product : products){
            if (product instanceof Сhocolate){
                Сhocolate chocolate = (Сhocolate)product;
                if (chocolate.getBrand().equals(brand) && chocolate.isAvailabilityOfMilk() == availabilityOfMilk){
                    return chocolate;
                }
            }
        }
        return null;
    }



}
