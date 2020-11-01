package RandomArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RandomArrayList<String> list = new RandomArrayList<String>();

        for (int i = 0; i < 100; i++) {
            list.add("word" + i);
        }

        System.out.println(list.getRandomElement());
    }
}
