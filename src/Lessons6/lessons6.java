package Lessons6;

public class lessons6 {
    public static void main(String[] args) {
        int x = 3;
        int y=0;
        int z=1;
        try {
            System.out.println(x / y);
            System.out.println(x / z);
        }
        catch (ArithmeticException ErrorException) {
            System.out.println("Ой у меня ошибка деление на ноль");
        }
        try {
            Animal animal = new Animal("Tigr", "BLACK");
        }
        catch (RuntimeException RErorr){
            System.out.println("Нет цвета");
        }
        System.out.println("OK");
    }
}
