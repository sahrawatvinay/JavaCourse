class Animal {
    public void run() {
        System.out.println("Animal running!");
    }
}

public class AnonymousInner {
    static void main(String[] args) {
        Animal Peacock = new Animal() {
            public void run() {
                System.out.println("Flyinggg");
            }
        };
        Peacock.run();
    }
}
