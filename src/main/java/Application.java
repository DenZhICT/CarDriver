public class Application {
    void run() {
        Driver driver = new Driver();
        Car car = new Car();
        GasStation gasStation = new GasStation();

        driver.setCar(car);
        car.setDriver(driver);

        car.setFuel();
        driver.lookAtFuel();
        driver.goToStation(gasStation.getLocation());

        driver.openTank();
        double amountOfFuel = driver.refuelingCar();
        driver.closeTank();
        double price = gasStation.howMuch(amountOfFuel, driver.car.getFuelType());
        driver.pay(price);
    }
}
