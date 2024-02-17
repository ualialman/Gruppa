import models.Action;
import models.Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Ochen Very Cool Zoo");

        // TEST
        Animal animal = new Animal();
        ArrayList<Action> actions = new ArrayList<>();
        actions.add(new Action("Give banana", "Monkey took your banana"));
        actions.add(new Action("Give milk", "Monkey took your milk"));

        animal.setName("Monkey");
        animal.setAge(42);
        animal.setType("mammal");
        animal.setLocation("tropics");
        animal.setActions(actions);

        System.out.println(animal.toString());
    }
}