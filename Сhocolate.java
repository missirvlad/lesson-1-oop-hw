public class Сhocolate extends Product{
    private double calories;
    private boolean availabilityOfMilk;

    public boolean isAvailabilityOfMilk() {
        return availabilityOfMilk;
    }

    public void setAvailabilityOfMilk(boolean availabilityOfMilk) {
        this.availabilityOfMilk = availabilityOfMilk;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public Сhocolate(String brand, String name, double price, int calories, boolean availabilityOfMilk){
        super(brand, name, price);
        setCalories(calories);
        setAvailabilityOfMilk(availabilityOfMilk);

    }
    @Override
    public String displayInfo() {
        return String.format("Плитка шоколада\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКаллории: %.0f\n\tМолоко: %s]",
                brand, name, price, calories, availabilityOfMilk);
    }
}
