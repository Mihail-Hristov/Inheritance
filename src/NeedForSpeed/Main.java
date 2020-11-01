package NeedForSpeed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SportCar sportCar = new SportCar(40.00, 120);
        FamilyCar familyCar = new FamilyCar(20.00, 80);
        Car car = new Car(30, 110);
        Motorcycle motorcycle = new Motorcycle(25.00, 200);

        System.out.println(familyCar.getFuelConsumption());
        System.out.println(sportCar.getFuelConsumption());
        System.out.println(car.getFuelConsumption());
        System.out.println(motorcycle.getFuelConsumption());

        System.out.println(sportCar.getFuel());
        sportCar.drive(320);
        System.out.println(sportCar.getFuel());

    }
}
