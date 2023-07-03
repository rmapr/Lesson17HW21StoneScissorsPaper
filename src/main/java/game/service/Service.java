package game.service;

import java.util.Random;
import java.util.Scanner;

public class Service {

    public Integer computerResult() {
        return new Random().nextInt(3);
    }

    public Integer getPlayerSubj(Scanner scanner) {
        int i;
        do {
            System.out.println("Choose:\n\"Stone\" - 0\n\"Scissors\" - 1\n\"Paper\" - 2");
            i = scanner.nextInt();
            if (i < 0 || i > 2) {
                System.out.println("Not correct, please repeat!");
            } else return i;
        } while (i < 0 || i > 2);
        return i;
    }

}
