package inheritance;

class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        int add = calc.add(5,6);
        int sub = calc.sub(11,2);
        int mult = calc.mult(2,3);
        int div = calc.div(4,2);
        System.out.println(add + " - " + sub + " - " + mult + " - " + div);
    }
}
