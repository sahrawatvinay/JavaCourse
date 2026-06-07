class Human {
    String name;
    int age;

    public Human() {
        this.name = "Vinay";
        this.age = 28;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ClassConcept {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human("Deepak",32);
        System.out.println(h1.getName() + ":" + h1.getAge());
        System.out.println(h2.getName() + ":" + h2.getAge());
    }
}
