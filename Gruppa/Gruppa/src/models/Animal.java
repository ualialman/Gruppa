package models;

import java.util.ArrayList;

public class Animal {
    private static int id = 0;
    private String name;
    private int age;
    private String type;
    private String location;
    private ArrayList<Action> actions;

    public Animal() {

    }
    public Animal (int id,
                   String name,
                   int age,
                   String type,
                   String location,
                   ArrayList<Action> actions
    ) {
        Animal.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.location = location;
        this.actions = actions;
    }
    public Animal (
            String name,
            int age,
            String type,
            String location,
            ArrayList<Action> actions
    ) {
        id++;
        this.name = name;
        this.age = age;
        this.type = type;
        this.location = location;
        this.actions = actions;
    }

    public static void setId(int id) {
        Animal.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }


    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", actions=" + actions.toString() +
                '}';
    }
}