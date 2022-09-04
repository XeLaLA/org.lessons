package Lessons6;

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = Color.valueOf(color).toString();

    }
}
