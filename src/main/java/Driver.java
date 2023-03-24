import java.util.Scanner;

public class Driver {
    private final String name;
    private final String id;
    private double wallet;
    public Car car;
    private final Scanner sc = new Scanner(System.in);
    public Driver() {
        System.out.println("Введите имя водителя:");
        name = sc.nextLine();
        System.out.println("Введите номер водительского удостоверения:");
        id = sc.nextLine();
        System.out.println("Введите кол-во имеющихся денег:");
        wallet = sc.nextDouble();
    }

    public void setCar(Car car){
        this.car = car;
    }

    public void lookAtFuel() {
        System.out.println("Запас топлива: "+String.format("%.2f", car.getFuel()));
    }

    public void goToStation(double[] stationLoc) {
        double[] carLoc = car.getLocation();
        double dist = Math.sqrt(Math.pow(stationLoc[0]-carLoc[0],2)+Math.pow(stationLoc[1]-carLoc[1],2));
        System.out.println("До заправки надо проехать: " + String.format("%.2f",dist));
        System.out.println("Вы приехали");
    }

    public void openTank() {
        System.out.println("Бак открыт");
    }

    public void closeTank() {
        System.out.println("Бак закрыт");
    }

    public double refuelingCar() {
        double fuel = car.gerTankCapacity() - car.getFuel();
        System.out.println("До полного бака нужно заправить: " + String.format("%.2f",fuel));
        System.out.println("Машина полностью заправлена");
        return fuel;
    }

    public void pay(double price) {
        System.out.println("Вам надо заплатить: "+String.format("%.2f",price));
        if (wallet - price >= 0){
            System.out.println("Вы успешно произвели оплату");
        } else {
            System.out.println("Вам не хватает денег, чтобы оплатить заправку топливом");
        }
    }
}
