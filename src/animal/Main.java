package animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();

        while (!"Beast!".equals(input)) {
            String animalType = input;

            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String gender = tokens[2];

            Animal animal = null;

            if (animalType.equals("Cat")) {
                animal = new Cat(name, age, gender);
            }else if (animalType.equals("Dog")) {
                animal = new Dog(name, age, gender);
            }else if (animalType.equals("Frog")) {
                animal = new Frog(name, age, gender);
            }else if (animalType.equals("Kitten")) {
                animal = new Kitten(name, age, gender);
            }else if (animalType.equals("Tomcat")) {
                animal = new Tomcat(name, age, gender);
            }

            animals.add(animal);

            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}
