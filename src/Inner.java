class OuterA {
    int name;

    public void show() {
        System.out.println("inside show");
    }

    class InnerB {
        public void cfg() {
            System.out.println("configurations");
        }
    }

    static class StaticInnerC {
        public void stativInit() {
            System.out.println("Static inner");
        }
    }
}

public class Inner {
    static void main(String[] args) {
        OuterA obj = new OuterA();
        obj.show();
        OuterA.InnerB obj2 = obj.new InnerB();
        obj2.cfg();
        OuterA.StaticInnerC obj3 = new OuterA.StaticInnerC();
        obj3.stativInit();
    }
}
