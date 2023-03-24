import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GasStation {
    private final String name;
    private double[] location;
    private final Map<String, Double> gasPrice = new HashMap<>();;
    private final Scanner sc = new Scanner(System.in);
    public GasStation() {
        System.out.println("Введите имя заправки:");
        name = sc.nextLine();
        location = new double[] {(Math.random()*((100-0)+1))+0,(Math.random()*((100-0)+1))+0};
        gasPrice.put("92", 47.7);
        gasPrice.put("95", 51.4);
        gasPrice.put("98", 62.6);
        gasPrice.put("ДТ", 59.4);
    }


    public double[] getLocation() {
        return location;
    }

    public double howMuch(double amountOfFuel, String fuelType) {
        return amountOfFuel*gasPrice.get(fuelType);
    }
}
