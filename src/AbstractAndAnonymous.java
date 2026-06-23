abstract class Machine {
    public abstract void start();
    public abstract void drive();
}
public class AbstractAndAnonymous {
    static void main(String[] args) {
        Machine m = new Machine() {
            @Override
            public void start() {
                System.out.println("Machine starts");
            }

            @Override
            public void drive() {
                System.out.println("Machine drives");
            }
        };
        m.start();
        m.drive();
    }
}
