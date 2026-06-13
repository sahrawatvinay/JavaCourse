class D {
    public void show1() {
        System.out.println("in D");
    }
}

class E extends D {
    public void show2() {
        System.out.println("in E");
    }
}

public class UpCastingDownCastingOOPS {
    public static void main(String[] args) {

        // Normal object creation
        E obj = new E();
        obj.show2(); // Output: in E
        // obj is of type E, so it can access show2()

        obj.show1(); // Output: in D
        // E inherits show1() from D

        System.out.println("----------");

        // Upcasting
        D obj1 = new E();
        obj1.show1(); // Output: in D
        // Reference type is D, so Java only allows methods
        // that exist in D at compile time.

        // obj1.show2(); // Compile Error
        // D does not have show2()
        // Compiler checks the REFERENCE TYPE (D)

        System.out.println("----------");

        // Downcasting
        E obj2 = (E) obj1;
        obj2.show1(); // Output: in D
        // E inherited show1() from D

        obj2.show2(); // Output: in E
        // After downcasting, Java knows obj2 is E
        // so show2() becomes accessible
    }
}