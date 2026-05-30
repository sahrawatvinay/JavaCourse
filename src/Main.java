class Car {
    String color;
    int model;
    void start(){
        System.out.println("Car started");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Car c = new Car();
        c.start();
    }
}