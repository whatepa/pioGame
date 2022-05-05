package players;

import java.util.Scanner;

public class PlayerHuman extends Player {

    private final Scanner scan = new Scanner(System.in);

    public PlayerHuman() {}

    public PlayerHuman(String name) {
        super(name);
    }


    @Override
    public int guess() {
        System.out.print("Wpisz liczbę (1-6): ");
        return scan.nextInt();
    }

}