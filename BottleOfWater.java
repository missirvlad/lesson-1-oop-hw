public class BottleOfWater extends Product{

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        setVolume(volume);
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с водой\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tОбъем: %.2f]",
                brand, name, price, volume);
    }
}
