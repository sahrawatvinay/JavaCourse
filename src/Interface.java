interface Computer {
    String ram = "16GB";

    void display();
}

class Laptop implements Computer {
    public void display() {
        System.out.println("Laptop.display");
    }
}

class Desktop implements Computer {
    public void display() {
        System.out.println("Desktop.display");
    }
}

public class Interface {
    static void main(String[] args) {
        Computer c = new Laptop();
        c.display();
        c = new Desktop();
        c.display();
    }
}
