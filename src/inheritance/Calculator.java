package inheritance;

class BasicCalculator extends AdvancedCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        AdvancedCalculator calc = new BasicCalculator(); //it can call only parent methods
        BasicCalculator bc = (BasicCalculator) calc;
        int add = bc.add(5,6);
        int sub = bc.sub(11,2);
        int multi = bc.mult(5,7);
        int divi = bc.div(10,15);
        int mult = calc.mult(2,3);
        int div = calc.div(4,2);
        System.out.println(add + " - " + sub + " - " + mult + " - " + div);
    }
}
