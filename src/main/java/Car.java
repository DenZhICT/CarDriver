import java.util.Scanner;

public class Car {
    private final String name;
    private final String id;
    private final String fuelType;
    public Driver driver;
    private final Scanner sc = new Scanner(System.in);
    private double fuel;
    private double tankCapacity;

    public Car() {
        System.out.println("Введите имя машины:");
        name = sc.nextLine();
        System.out.println("Введите номер автомобиля:");
        id = sc.nextLine();
        System.out.println("Введите вид топлива:");
        fuelType = sc.nextLine();
        System.out.println("Введите вместительность бака:");
        tankCapacity = sc.nextDouble();
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public double[] getLocation() {
        return new double[] {(Math.random()*((100-0)+1))+0,(Math.random()*((100-0)+1))+0};
    }

    public void setFuel() {
        fuel = Math.random()*((tankCapacity-0)+1)+0;
    }

    public double getFuel() {
        return fuel;
    }

    public String getFuelType(){
        return fuelType;
    }

    public double gerTankCapacity() {
        return tankCapacity;
    }
}
