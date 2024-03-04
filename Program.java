import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        //Product  product1 = new Product("Brand #1", "Name #1", 350);
        //System.out.println(product1.displayInfo());


        //BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        //System.out.println(bottleOfWater1.displayInfo());

        //BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        //System.out.println(bottleOfMilk1.displayInfo());
        Сhocolate сhocolate1 = new Сhocolate("Alenka", "with almond", 100, 540, true);
        System.out.println(сhocolate1.displayInfo());
        Сhocolate сhocolate2 = new Сhocolate("Alenka", "", 150, 560, false);
        System.out.println(сhocolate2.displayInfo());

        ArrayList<Product> list = new ArrayList<>();
        //list.add(bottleOfMilk1);
        //list.add(bottleOfWater1);
        list.add(new BottleOfMilk("Brand #4", "Name #5", 310, 0.33, 1));
        list.add(сhocolate1);

        VendingMachine vendingMachine = new VendingMachine(list);
        BottleOfWater bottleOfWaterRes =  vendingMachine.getBottleOfWater("Name #2", 0.5);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }
        Сhocolate chocolateRes = vendingMachine.getCocolate("Alenka", true);
        if (chocolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        }
        else {System.out.println("Такой шоколадки нет в автомате.");}
    }
}
