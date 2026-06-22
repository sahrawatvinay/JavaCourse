abstract class AbsCar {
    public abstract void drive();
    public abstract void flying();
    public void playMusic() {
        System.out.println("playing music");
    }
}

abstract class WagonR extends AbsCar {
    public void drive() {
        System.out.println("Drive");
    }
}

class FlyingWagonR extends WagonR {
    public void flying() {
        System.out.println("Flying");
    }
    public void drive(){
        System.out.println("drive or fly?");
    }
}

public class Abstract {
    public static void main(String[] args) {
        AbsCar Car = new FlyingWagonR();
        Car.playMusic();
        Car.drive();
        Car.flying();
    }
}
