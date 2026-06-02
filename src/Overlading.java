class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
    /*double add(int a, int b){ //error: only different return type will not make the cut
        return a + b;
    }*/
}

//methods with same name but different number or types of parameters
//return type not into considerations, if same params or types but return type different, not overloading
//it will be considered as a duplicate method
public class Overlading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 9));
        System.out.println(c.add(15, 19, 30));
        System.out.println(c.add(5.77, 99.99));
    }
}
